import java.util.Scanner;

public class IT24100822Lab7Q1A
{   
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        
        int mark1, mark2, mark3, mark4;
        
    
        System.out.println("Enter marks for four subjects:");
        System.out.print("Enter Subject Mark 1: ");
        mark1 = scanner.nextInt();
        System.out.print("Enter Subject Mark 2: ");
        mark2 = scanner.nextInt();
        System.out.print("Enter Subject Mark 3: ");
        mark3 = scanner.nextInt();
        System.out.print("Enter Subject Mark 4: ");
        mark4 = scanner.nextInt();
        
      
        double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
        System.out.printf("Average is" +average);
        
        
        String grade;
        if (average >= 75 && average <= 100)
        {
            grade = "Distinction";
        } 
        else if (average >= 50 && average < 75)
        {
            grade = "Credit";
        } 
        
        else
        {
            grade = "Fail";
        }
        
        // Output the grade
        System.out.println("Overall Grade is: " + grade);
        
        
    }
}
