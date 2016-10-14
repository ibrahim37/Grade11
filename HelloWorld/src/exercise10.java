import java.util.Scanner;

/**
 * 
 */

/**
 * @author 324067404
 *
 */
public class exercise10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double burger = 1.69;
		double fries = 1.09;
		double soda = 0.99;
		
		int burgers;
		int fries1 = 0;
        int sodas;
        int beforetax;
        int Tax;
        int finaltotal;
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of burgers:");
        burgers= scan.nextInt();
        System.out.println("Enter the number of fries:");
        burgers= scan.nextInt();
        System.out.println("Enter the number of sodas:");
       sodas=scan.nextInt(); 
        System.out.println("Total before tax:" +(burger+1.60+fries1+1.09+soda+0.99));
        System.out.println("Tax:"+(Tax));
        
        System.out.println("Final Total:"+(burger+1.60+fries+1.09+soda+0.99));
        finaltotal= scan.nextInt();
        
        
        
        
        	
        
        
	}

}
