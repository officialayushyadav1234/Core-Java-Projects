import java.util.*;
public class Bank
{
   static double balance = 0;
   
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     int option = 0;
     while (option != 4)
              {  
                System.out.println("Welcome to the Bank");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposite");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("Enter An Option: ");
                option = sc.nextInt();
                   
                // Starting Switch Case ===========================
                     
                 switch (option) {
                                   case 1:
                                         checkBalance();
                                         break;
                                   case 2:
                                         deposite();
                                         break;
                                   case 3:
                                         withdraw();
                                         break;
                                   case 4:
                                         exit();
                                         break;
                                   default:
                                         System.out.println("Invalid option. Please Try Again.");
                                         break;
                                  } 
                }
     }
 
    public static void checkBalance()
     {
       System.out.println("Your current Balance is: "+balance);
     }
    
    public static void deposite()
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Amount to Deposite: ");
       double amount = sc.nextDouble();
       balance += amount;
       System.out.println(amount + "Rupees has been Deposited to Your account.");
       checkBalance();
     }
  
    public static void withdraw()
     {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Amount to Withdraw: ");
      double amount = sc.nextDouble();
       if (amount > balance)
           {
             System.out.println("Insufficient funds.");
            }
        else
            {
              balance -= amount;
              System.out.println(amount+ " Rupees has been withdrawn from Your account.");
             }   
        checkBalance();
        }
  
     public static void exit()
      {
        System.out.println("Thank You for Banking with us.");
        System.out.println("Have a Great Day! ");
      }
}
    

                        
                     
 