package lab5;
/*Name : Nathan Myrie
 * ID  : 620155753
 */
import java.io.*;
import java.util.*;

public class lab5 {

    public static void main(String[] args) throws FileNotFoundException {
        // Create a Scanner object to read the input
        Scanner scanner = new Scanner(new File("input.txt"));

        // Initialize a counter and a list to store palindromes
        int count = 0;
        List<String> palindromes = new ArrayList<String>();

        // Loop through each line of the input
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();

            // Check if line is a palindrome
            if (isPalindrome(line)) {
                count++;
                palindromes.add(line);
                
                
            }
            
        }

        // Print the number of palindromes and the palindromes
        System.out.println("Number of palindromes: " + count);
        System.out.println("Palindromes: " + palindromes);
    }

    /**
     * Checks if a string is a palindrome
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str)
     {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
     }}
