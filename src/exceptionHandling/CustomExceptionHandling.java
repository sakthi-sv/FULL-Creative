/**
 * 
 */
package exceptionHandling;

import java.io.IOException;

/**
 * @author HP
 *
 */
public class CustomExceptionHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException,UserNameExistException {
		// TODO Auto-generated method stub
		try {
			// throw new IOException("cd");
			throw new UserNameExistException("User already exist");			
		}
		catch(Exception e) {
			System.out.println("Exception:"+e);
		}
		System.out.println("rest of the code...");   
	}
}

	  