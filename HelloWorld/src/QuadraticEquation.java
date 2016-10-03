import java.util.Scanner;

/**
 * 
 */

/**
 * @author 324067404
 *
 */
public class QuadraticEquation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int a, b, c;
         System.out.println("Enter a number for a variable");
         a= scan.nextInt();
         b= scan.nextInt();
         c= scan.nextInt();
      		 
         System.out.println(-b +Math.sqrt(Math.pow(b, 2)+(4*(a*c))));
         System.out.println(-b -Math.sqrt(Math.pow(b, 2)+(4*(a*c))));
         
         
         
      
        
         
        		 
      

         
         
         
		

	}

}
