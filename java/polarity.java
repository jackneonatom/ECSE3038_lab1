//QUESTION3
import java.util.Scanner;
public class polarity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of which you wish to test the polarity of: ");
        int num1 = scan.nextInt();
        
        if (num1 > 0) {//checks if the number entered is positive(greater than zero)
          System.out.println("The number entered is positive.");
        } else if (num1 < 0) {//checks if the number entered is negative(less than zero)
          System.out.println("The number entered is negative.");
        } else if(num1 == 0) {//checks if the number entered is actually equal to zero
          System.out.println("The number entered is zero.");
        }
      }
    
}
