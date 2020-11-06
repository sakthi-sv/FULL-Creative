package matrix;

import java.util.Scanner;

public class MulMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		MulMatrix obj=new MulMatrix();
		int m1=sc.nextInt();
		int n1=sc.nextInt();
		int m2=sc.nextInt();
		int n2=sc.nextInt();
		if(n1==m2){
			int[][] a=obj.getInput(m1, n1);
			int[][] b=obj.getInput(m2, n2);
			obj.display(a,m1,n1);
			obj.display(b, m2, n2);
			int[][] c=obj.mul(m1,n1,a,m2,n2,b);
			obj.display(c, m1, n2);
		}

	}
	public int[][] getInput(int m,int n){
		Scanner sc=new Scanner(System.in);
		int [][] x=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				x[i][j]=sc.nextInt();
		return x;
	}
	public int[][] mul(int m1,int n1,int[][] x,int m2,int n2,int[][] y){
		int[][] z=new int[m1][n2];
		for(int i=0;i<m1;i++){
			for(int j=0;j<n1;j++){
				z[i][j]=0;
				for(int k=0;k<n2;k++)
					z[i][j]+=x[i][k]*y[k][j];

			}
		}
		return z;
	}
	public void display(int[][] x,int m,int n){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				System.out.print(x[i][j]+" ");
			System.out.println();
		}
	}

}
