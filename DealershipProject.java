import java.util.Scanner;

public class DealershipProject {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    

    System.out.println("Welcome to KAYAD Dealership!");
    System.out.println("\nWould you like to:");
    System.out.println("'a'• Buy a car ");
    System.out.println("'b'• Sell a car ");
    String option = scan.nextLine();

    switch(option){
      case "a":
        System.out.println("What is your budget?");
        int budget = scan.nextInt();
        if(budget >= 10000){
          System.out.println("\nGreat, a nissan Altima is available.");
          System.out.println("\nDo you have insurance? Write 'yes' or 'no'.");
          scan.nextLine();
          String hasInsurance = scan.nextLine();
          
          System.out.println("\nDo you have a driver's licence? Write 'Yes' or 'no'.");
          String hasDL = scan.nextLine();

          System.out.println("\nWhat is your creditscore?");
          int creditScore = scan.nextInt();

          if(hasInsurance.equals("yes") && creditScore >= 660 && hasDL.equals("yes")){
            System.out.println("\nDeal! The car is yours. Pleasure doing business with you.");
          }else{
            System.out.println("\nWe're Sorry! You are not elligible.");
          }

        }else{
          System.out.println("We don't sell cars under $10000. Sorry!");
        }
      break;
      case "b":
      System.out.println("\nWhat is your car valued at?");
      int carValue = scan.nextInt();
      System.out.println("\nWhat is your selling at?");
      int carSellingPrice = scan.nextInt();
      if (carValue > carSellingPrice && carSellingPrice < 30000){
        System.out.println("\nWe will buy your car at the valuation of $" +
         carValue + " and a price of $" + carSellingPrice + ". Bring it to KAYAD. \nPleasure doing business with you. :)");
      } else{
        System.out.println("\nSorry! We are not interested. The valuation of $" + 
        carValue + " is higher than your selling price of $" + 
        carSellingPrice + ".Bye! :(");
      }
      
      break;
      default:
      System.out.println("\nYou have entered the wrong option.");

    }
    scan.close();

  }
  
}