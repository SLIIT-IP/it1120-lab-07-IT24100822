import java.util.Scanner;

public class IT24100822Lab7Q1B 
{   
    
    public static String calculateGrade(double average)
    {
        if (average >= 75) {
            return "Distinction";
        } else if (average >= 60) {
            return "Credit";
        } else if (average >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int student = 1; student <= 3; student++)
        {
            System.out.println("Student " + student);
            System.out.println("Enter marks for 4 subjects (separated by space):");
            
            // Reading marks for 4 subjects
            int subject1 = scanner.nextInt();
            int subject2 = scanner.nextInt();
            int subject3 = scanner.nextInt();
            int subject4 = scanner.nextInt();
            
            // Calculating the average
            double average = (subject1 + subject2 + subject3 + subject4) / 4.0;
            
            // Displaying results
            System.out.println("Average is: " + average);
            System.out.println("Overall Grade is: " + calculateGrade(average));
            System.out.println();
        }
        
        
    }
}
