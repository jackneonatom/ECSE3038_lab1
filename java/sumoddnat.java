//QUESTION 5
import java.util.Scanner;
public class sumoddnat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = scan.nextInt();
        
        int oddsum = 0;
        for (int i = 1; i <= num1; i += 2) {
          oddsum += i;
        }
        
        System.out.println("The sum of all numbers which are odd up to " + num1 + " is " + oddsum );
      }
    
}
