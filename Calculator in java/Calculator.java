import java.util.*;

public class Calculator {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        char prevop='+';
        char currop ;
        System.out.println("Enter the first Number:");
        int a = sc.nextInt();
        System.out.println("Enter the Operator:");
        currop = sc.next().charAt(0);

        do{
            System.out.println("Enter the next Number:");
            int b =sc.nextInt();

            switch (currop) {
               
                case '+':
                    sum=sum+b;
                    break;

                case '-':
                    sum = sum-b;
                    break;

                case '*':
                    if(prevop=='+'){
                        sum = sum-a;
                        sum = sum+a*b;
                    }
                    else if (prevop=='-') {
                        sum = sum+a;
                        sum = sum-a*b;
                    }

                case '/':
                     if(prevop=='+'){
                        sum = sum-a;
                        sum = sum+a/b;
                     }
                     else if(prevop=='-') {
                            sum = sum-a;
                            sum = sum+a/b;
                        }
                     break;

                default:
                    break;
            }
            a=b;
            prevop=currop;
            System.out.println("Enter operator:");
            currop=sc.next().charAt(0);
        
        } while(currop != '=');
        System.out.println("\nTotal Result is : " +sum); 

    }
}
