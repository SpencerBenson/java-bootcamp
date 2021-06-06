import java.util.Scanner;

class Survey{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int counter = 0;

    System.out.println("Welcome. Thank you for taking the survey.");
    System.out.println("What is your name?");
    String name =  scan.nextLine();
    counter++;

    System.out.println("We are happy to have you here " + name);
    System.out.println("How much money do you spend on coffee? " + name);
    double coffeePrice = scan.nextDouble();
    counter++;

    System.out.println("\nHow much money do you spend on fast food? " + name);
    double fastFoodPrice = scan.nextDouble();
    counter++;

    System.out.println("\nHow many times a week do you buy coffee?");
    int coffeeAmount = scan.nextInt();
    counter++;

    System.out.println("\nhow many times a week do you eat out?");
    int fastFoodAmount = scan.nextInt();
    counter++;

    double  expenditure = (fastFoodPrice * fastFoodAmount)  + (coffeePrice * coffeeAmount);

    System.out.println("\nYour total expenditure is: " + expenditure);
    System.out.println("\n Thank you for answering " + counter + " questions.");
    scan.close(); // Close scanner to prevent memory leak.

  }
}