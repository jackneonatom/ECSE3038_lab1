package java.src;
import java.util.Scanner;
public class IO1 {
     
    
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the circle radius: ");
        double radius = scan.nextDouble();
        
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        
        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + perimeter);
      
    
    
        
    }
    
    
}
