import java.util.Scanner;

public class PercentMarks {
  public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Total Marks is: 100");
        System.out.println("Enter Your marks in Hindi :");
        int h = sc.nextInt();
        System.out.println("Enter Your marks in English :");
        int e = sc.nextInt();
        System.out.println("Enter Your marks in Maths :");
        int m = sc.nextInt();
        System.out.println("Enter Your marks in Science :");
        int s = sc.nextInt();
        System.out.println("Enter Your marks in Social Science :");
        int soc = sc.nextInt();

       
        int total = h + e + m + s + soc;
        double average=(total/5.0);
        double percentage =(total / 5.0);

        //double percentage =((total / 500) * 100);

       // For Grade
        if (average >= 90)
           {System.out.println("grade = A++");}
        else if (average >= 75 && average < 90)
           {System.out.println("grade = A+");}
        else if (average >= 60 && average < 75)
            {System.out.println("grade = A");}
        else if (average >= 45 && average < 60)
            {System.out.println("grade = B");}
        else if (average >= 30 && average < 45)
            {System.out.println("grade = C");}
        else if (average >= 1 && average < 30)
            {System.out.println("grade = D");}
        else 
            {System.out.println("Grade Not found");}
           
            
        
        System.out.println("The Total marks = " + total + "/500.0");
        System.out.println("The Percentage = " + percentage + "%");
        
    }
}

