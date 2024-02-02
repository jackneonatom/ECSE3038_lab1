//QUESTION 4
import java.util.Scanner;
public class monthdaycheck
 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of a month: ");
        String month = scan.nextLine();
        
        int days;
        switch (month.toLowerCase()) {//uses built in method to covert all input to lower case incase the entered value for the month contained upper case letters.
          case "february":
            days = 28;
            break;
          case "january":
          case "march":
          case "may":
          case "july":
          case "august":
          case "october":
          case "december":
            days = 31;
            break;
          
          case "april":
          case "june":
          case "september":
          case "november":
            days = 30;
            break;
          default:
            System.out.println("Invalid input, check spelling of entered month");
            return;
        }
        
        System.out.println("There are " +days+ " days in " +month);
      }
}
