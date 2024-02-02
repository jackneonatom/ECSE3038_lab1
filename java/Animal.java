/*
 * Name: Nathan Myrie
 * ID#:  620155753
 */

import java.util.Scanner;

/* 
public class CarPriceCalculator {
     int ageOfVehicle;
     int purchasePriceOfVehicle;
     String modelNameOfVehicle;
    
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
        System.out.println("The value of your "+modelNameOfVehicle+" is $"+currentPrice+".");
    }
}
*/

public abstract class Animal {

  private int health = 100;//sets the health of each animal at 100HP
  public String name;

  public static String display() {
    return "Lion, Tiger, Bear ";//dsiplays the animal options
  }

  public int getHealth() {
    return this.health;//checks what the health of the animals are
  }

  public void setName(String newName) {
    this.name = newName;//sets the new name of the animal chosen by the user
  }

  public void setHealth(int health) {
    this.health = health;//sets the new health of the animal
  }

  public abstract void bite(Animal opponent);

  public abstract void slash(Animal opponent);

  public abstract void roar(Animal opponent);

  public abstract String name();
}

class Bear extends Animal {

  private final int biteStat = 15;//set the amount of hp damage done by each attack
  private final int roarStat = 14;
  private final int slashStat = 31;

  public Bear() {}

  // public String name() {
  //     return "Bear";
  // }

  public void bite(Animal opponent) {
    opponent.setHealth(opponent.getHealth() - this.biteStat);//subtracts the hp damage of the attacks from the hp of the animal
  }

  public void slash(Animal opponent) {
    opponent.setHealth(opponent.getHealth() - this.slashStat);
  }

  public void roar(Animal opponent) {
    opponent.setHealth(opponent.getHealth() - this.roarStat);
  }
}

class Lion extends Animal {

  private final int biteStat = 20;
  private final int roarStat = 15;
  private final int slashStat = 25;

  public Lion() {}

  // public String name() {
  //     return "Lion";
  // }

  public void bite(Animal opponent) {
    opponent.setHealth(opponent.getHealth() - this.biteStat);
  }

  public void slash(Animal opponent) {
    opponent.setHealth(opponent.getHealth() - this.slashStat);
  }

  public void roar(Animal opponent) {
    opponent.setHealth(opponent.getHealth() - this.roarStat);
  }
}

class Tiger extends Animal {

  private final int biteStat = 23;
  private final int roarStat = 17;
  private final int slashStat = 20;

  public Tiger() {}

  // public String name() {
  //     return "Tiger";
  // }

  public void bite(Animal opponent) {
    opponent.setHealth(opponent.getHealth() - this.biteStat);
  }

  public void slash(Animal opponent) {
    opponent.setHealth(opponent.getHealth() - this.slashStat);
  }

  public void roar(Animal opponent) {
    opponent.setHealth(opponent.getHealth() - this.roarStat);
  }
}

class AnimalBrawl {

  public static void main(String args[]) {
    try (Scanner scanner = new Scanner(System.in)) {
      boolean exit = false;

      while (!exit) {
        System.out.println("Welcome to Animal Brawl !!!");
        System.out.println("Player 1, pick your animal: " + Animal.display());

        String animal = scanner.nextLine();//prompts the user to enter the animal they would like to use

        Animal player1 = createInstance(animal);

        System.out.println("Enter animal name:\n");
        String newName = scanner.nextLine();//allows the user 1 to name their animal
        player1.setName(newName);//sets the newname of the anima;

        System.out.println("Player 2, pick your animal: " + Animal.display());

        animal = scanner.nextLine();
        Animal player2 = createInstance(animal);

        System.out.println("Enter animal name:\n");
        newName = scanner.nextLine();
        player2.setName(newName);

        boolean isBattle = true;

        while (isBattle) {
          if (player1.getHealth() <= 0 || player2.getHealth() <= 0) {//checks to see if the one of the animals health is at zero to know whether or not to stop the loop
            isBattle = false;
          } else {//continues the battle if the health is not equal to zero
            System.out.println(
              "Player 1 Health:" +
              player1.getHealth() +
              "\nPlayer 2 Health:" +
              player2.getHealth() +
              "\n"
            );
            System.out.println(
              "Player 1, choose an attack:\nBite\nRoar\nSlash:\n"
            );
            String attack = scanner.nextLine();
            attack = attack.toLowerCase();

            if (attack == "bite") {
              player1.bite(player2);
            } else if (attack == "roar") {
              player1.roar(player2);
            } else {
              player1.slash(player2);
            }
//displays the plays information
            System.out.println(
              "Player1's " +
              player1.name +
              " " +
              attack +
              " Player2's " +
              player2.name
            );

            System.out.println(
              "Player 1 Health:" +
              player1.getHealth() +
              "\nPlayer 2 Health:" +
              player2.getHealth() +
              "\n"
            );
            System.out.println(
              "Player 2, choose an attack:\nBite\nRoar\nSlash:\n"
            );
            String attack2 = scanner.nextLine();
            attack2 = attack2.toLowerCase();

            if (attack2 == "bite") {
              player2.bite(player1);
            } else if (attack == "roar") {
              player2.roar(player1);
            } else {
              player2.slash(player1);
            }

            System.out.println(
              "Player2's " +
              player2.name +
              " " +
              attack +
              " Player1's " +
              player1.name
            );
          }
        }
        if (player1.getHealth() > player2.getHealth()) {// shows who is the winner based on whose hp reachs zero last
          System.out.println("Player 1 is the winner !!!");
        } else {
          System.out.println("Player 2 is the winner !!!");
        }

        System.out.println("Do you wish to play again?");
        String play = scanner.nextLine();

        if (play.toLowerCase() == "yes") {//supposed to restart the game if the user prompts the game to restart again 
          exit = true;
        } else {
            exit=false;
          System.exit(0);
        }
       
      }
      
    }
  }

  public static Animal createInstance(String selectedAnimal) {//creates an object for an animal if the use selects that they wish to play as that animal
    Animal animal = null;
    if (selectedAnimal.toLowerCase().equals("lion")) {
      animal = new Lion();
    }
    if (selectedAnimal.toLowerCase().equals("tiger")) {
      animal = new Tiger();
    }
    if (selectedAnimal.toLowerCase().equals("bear")) {
      animal = new Bear();
    }
    return animal;
  }
}
