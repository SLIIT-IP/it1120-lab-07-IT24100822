public class IT24100822Lab7Q2B
{
    public static void main(String[] args) {
        // Loop for numbers 1 to 5
        for (int i = 1; i <= 5; i++)
        {
            
            System.out.print(i + " - ");
            
           
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            
            // Move to the next line after printing stars for each number
            System.out.println();
        }
    }
}
