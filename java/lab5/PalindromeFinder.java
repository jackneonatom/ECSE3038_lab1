package lab5;



import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 

public class PalindromeFinder { 
	public static void main(String[] args) throws FileNotFoundException { 
		// Creating File instance 
		File file = new File("input.txt"); 

		try (// Creating Scanner instance 
		Scanner sc = new Scanner(file)) {
			// Reading each line of the file 
			while (sc.hasNextLine()) { 
				String line = sc.nextLine(); 
				
				// Checking for palindrome 
				if (isPalindrome(line)) 
					System.out.println(line); 
			}
		} 
	} 

	static boolean isPalindrome(String str) 
	{ 

		// Pointers pointing to the beginning 
		// and the end of the string 
		int i = 0, j = str.length() - 1; 

		// While there are characters toc compare 
		while (i < j) { 

			// If there is a mismatch 
			if (str.charAt(i) != str.charAt(j)) 
				return false; 

			// Increment first pointer and 
			// decrement the other 
			i++; 
			j--; 
		} 

		// Given string is a palindrome 
		return true; 
	} 
}