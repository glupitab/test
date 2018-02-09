//Maria Govea
//02/21/2018
//This program is adding the cost of the items that are being sold and is printing the total with sales tax.

import java.text.DecimalFormat;
import java.util.Scanner;
public class Maria_Govea_Smith_Assignment1 {


	public static void main(String[] args) {
		System.out.println("Thank you for choosing");
		System.out.println ("Once Upon a Book ");
		
		//Declaring variables 
		String title1; 
		String title2; 
		double salestax, subtotal, total;
		double cost1, cost2; 
		Scanner keyboard = new Scanner (System.in); 
		DecimalFormat ft = new DecimalFormat ("#.##");
		
		//Entering input from the Keyboard
		System.out.println ("Book Title");
		title1 = keyboard.nextLine (); 
		System.out.println("Price: "); 
		cost1 = keyboard.nextDouble(); 
		keyboard.nextLine();
		System.out.println("Book Title ");
		title2 = keyboard.nextLine (); 
		System.out.println("Price:");
		cost2 = keyboard.nextDouble ();
	
		//Total sell of the 2 items before tax 
		subtotal = (cost1 + cost2); 
		
		//Sale tax of 7.25 added to the subtotal
		salestax = (double)(subtotal * (7.25/100)); 
		
		//The total of subtotal and 7.25% of tax rate 
		total= (subtotal + salestax); 
		
		//Displaying the books title
		System.out.println("First book title is: " + title1);
		System.out.println("Second book title is: " + title2);
		System.out.println("Subtotal    $" + ft.format(subtotal));
	
		System.out.println("Tax 7.25%   $" + ft.format(salestax));
		System.out.println("Total       $" + ft.format(total)); 
		
	}

}
