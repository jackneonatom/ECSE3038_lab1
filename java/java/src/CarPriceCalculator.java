import java.util.Scanner;

public class CarPriceCalculator {
    private int ageOfVehicle;
    private int purchasePriceOfVehicle;
    private String modelNameOfVehicle;
    
    public CarPriceCalculator(int ageOfVehicle, int purchasePriceOfVehicle, String modelNameOfVehicle) {
        this.ageOfVehicle = ageOfVehicle;
        this.purchasePriceOfVehicle = purchasePriceOfVehicle;
        this.modelNameOfVehicle = modelNameOfVehicle;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the model of your vehicle: ");
        String modelNameOfVehicle = in.nextLine();
        System.out.print("Enter the age of your vehicle: ");
        int ageOfVehicle = in.nextInt();
        System.out.print("Enter the purchase price of your vehicle: ");
        int purchasePriceOfVehicle = in.nextInt();
        in.close();
        
        CarPriceCalculator car = new CarPriceCalculator(ageOfVehicle, purchasePriceOfVehicle, modelNameOfVehicle);
        int currentPrice = -200000 * ageOfVehicle + purchasePriceOfVehicle;
        System.out.println("The current price of your "+modelNameOfVehicle+" is "+currentPrice+".");
    }
}