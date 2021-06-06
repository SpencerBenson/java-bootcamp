import java.util.Scanner;

class Survey{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome. Thank you for taking the survey.");
    System.out.println("What is your name?");
    String name =  scan.nextLine();

    System.out.println("We are happy to have you here " + name);
    System.out.println("How much money do you spend on coffee? " + name);
    double coffeePrice = scan.nextDouble();

    System.out.println("How much money do you spend on fast food? " + name);
    double fastFoodPrice = scan.nextDouble();

    System.out.println("how many times a week do you buy coffee?");
    int coffeeAmount = scan.nextInt();

    System.out.println("how many times a week do you eat out?");
    int fastFoodAmount = scan.nextInt();

    double  expenditure = (fastFoodPrice * fastFoodAmount)  + (coffeePrice * coffeeAmount);

    System.out.println("Your total expenditure is: " + expenditure);

    scan.close(); // Close scanner to prevent memory leak.
  }
}