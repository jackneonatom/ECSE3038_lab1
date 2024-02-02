//QUESTION 2
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the word you wish to check if it is a palindrome: ");
        String word = scan.nextLine();
        
        boolean palindrome_check = true;
        int length = word.length();//checking the length of the entered word
        for (int i = 0; i < length / 2; i++)
         {
          if (word.charAt(length - i - 1)!= word.charAt(i)) {//checks if the word entered is the same backwards and forwards
            palindrome_check = false;
            break;
          }
        }
        
        if (palindrome_check) 
        {
          System.out.println("The word entered is a palindrome.");//if palindrome_check is true then this output is printed
        } else {
          System.out.println("The word entered is not a palindrome.");//if the palindrome is false then this output is printed
        }
      }

    
}
