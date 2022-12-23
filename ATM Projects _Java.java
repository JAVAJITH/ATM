import java.util.Scanner;	//import the Scanner package 
public class Main
{
  public static void main (String[]args)
  {
    int balance= 100000, Withdraw,Deposit;
    Scanner Customer = new Scanner (System.in);
    System.out.println ("ENTER THE Username");
    int Userid = Customer.nextInt ();
    System.out.println ("ENTER THE Password");
    int Password = Customer.nextInt ();
    System.out.println ("Welcome to the HDFC ATM ");
    while(true)  
        {  
            System.out.println("");  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for check balance");  
            System.out.println("Choose 3 for Deposit");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
        
            System.out.println ("Choose the Values");
            
            int Value = Customer.nextInt();
           // int balance ;
            
            switch (Value)
            {
             case 1:
                 {
                  System.out.println ("Withdraw the Amount");
                  
                  Withdraw = Customer.nextInt();
                  
                  if(balance>=Withdraw)
                    {
                       balance = balance - Withdraw;
                       System.out.println ("please collect cash is"+Withdraw); 
                      
                    }
                  else
                  {
                       System.out.println ("Insufficient balance"); 
                  }    
                  
                  break;
                 }
              case 2:
                 {
                  System.out.println ("Check Balance ");
                    System.out.println ("Total Amount is "+ balance);
                  break;
                 }     
             case 3:
                 {
                  System.out.println ("Deposit the Amount");
                  Deposit =Customer.nextInt();
                  balance = balance + Deposit ;
                  System.out.println ("Successfully Amount Deposited");
                  break;
                 } 
             case 4:
                 {
                  System.out.println("EXIT");
                  break;
                 }
                 
                 default : System.out.print("Please enter correct Details");
                 
            }
            
            
            
            
            
              
        }





  }
}
