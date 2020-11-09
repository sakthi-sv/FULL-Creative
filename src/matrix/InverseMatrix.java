package matrix;

import java.util.Scanner;

public class InverseMatrix {
	
	public int[][] getInput(int n){
		Scanner sc=new Scanner(System.in);
		int [][] x=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				x[i][j]=sc.nextInt();
		return x;
	}
	
	int[][] getCoFactor(int[][] x,int n,int cr,int cc){
		int[][] temp=new int[n][n];
		int r=0,c=0;
		for(int i=0;i<n;i++) {
			if(i==cr)	continue;
			for(int j=0;j<n;j++) {
				if(j==cc)	continue;
				temp[r][c++]=x[i][j];
				if(c==n-1) {
					r++;c=0;
				}
			}
		}
		return temp;
	}
	
	int determinant(int[][] x,int n) {
		int d=0,i=0,sign=1;
		if(n==1)	return x[0][0];
		for(int j=0;j<n;j++) {
			int[][] temp=getCoFactor(x, n, i, j);
			d+=sign*x[i][j]*determinant(temp, n-1);
			sign=-sign;
		}
		return d;
	}
	int[][] adjoin(int[][] x,int n){
		int[][] adj=new int[n][n];
		int[][] temp=new int[n][n];
		int sign=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				temp=getCoFactor(x, n, i, j);
				sign = ((i + j) % 2 == 0)? 1: -1;
				adj[j][i] = (sign)*(determinant(temp, n-1)); 
			}
		}
		return adj;
	}
	float[][] inverse(int d,int[][] adj,int n){
		float[][] inv=new float[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				inv[i][j]=adj[i][j]/(float)d;
			}
		}
		return inv;
	}
	
	public void display(int[][] x,int n){
		System.out.println("matrix");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.print(x[i][j]+" ");
			System.out.println();
		}
	}
	public void display(float[][] x,int n){
		System.out.println("Inverse matrix");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.print(x[i][j]+" ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		InverseMatrix im=new InverseMatrix();
		int n=sc.nextInt();
		int[][] a=im.getInput(n);
		int d=im.determinant(a, n);
		int[][] adj=im.adjoin(a, n);
		float[][] inv=im.inverse(d, adj, n);
		im.display(inv, n);
		
	}
	

}
