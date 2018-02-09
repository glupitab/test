import java.util.*;
public class chaier

{

    public static void main(String[] args)

    {

        //Declaring variables

        double Item1, Item2, Item3;

        double ItemPrice1, ItemPrice2, ItemPrice3;

        double Subtotal, SalesTax, TotalAmount;

              //Allowing keyboard input so I can print to the screen

        Scanner keyboard = new Scanner(System.in);

         

        System.out.println("Enter Quantity of first item: ");

        Item1 = keyboard.nextDouble();

         

        System.out.println("Enter the price of the first item: $ ");

        ItemPrice1 = keyboard.nextDouble();

         

        System.out.println("Enter Quantity of the second item: ");

        Item2 = keyboard.nextDouble();
       

        System.out.println("Enter the price of the second item: $ ");
     ItemPrice2 = keyboard.nextDouble();

         
        System.out.println("Enter Quantity of the third item: ");
        Item3 = keyboard.nextDouble();
         
        System.out.println("Enter the price of the third item: $ ");
        ItemPrice3 = keyboard.nextDouble();

         

        //Total of all three items before sales tax is added

        Subtotal = ItemPrice1 + ItemPrice2 + ItemPrice3;

                 
        //Sales tax of 7% multiplied to the Subtotal

        SalesTax = Subtotal * 0.07;

         

        //Total amount which is the Subtotal plus the added 7% tax rate

        TotalAmount = Subtotal + SalesTax;

        System.out.printf("Subtotal: $%.2 \n"+ Subtotal);

         
        System.out.printf("Sales Tax: $%.2f \n" + SalesTax);

         

        System.out.printf("Total Amount: $%.2f \n", + TotalAmount);
    }
}

System.out.printf("Subtotal: $%.2f\n", subtotal);
System.out.printf("Tax: $%.2f\n", salestax);
System.out.printf("Total: $%.2f\n", total);  
