import java.util.Scanner;

public class JavaGram {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to Javagram!");
    System.out.println("\nRegister your details below to join.");
    System.out.println("\nWhat is your first name?");
    String firstName = scan.nextLine();

    System.out.println("\nWhat is your last name?");
    String lastName = scan.nextLine();

    System.out.println("\nHow old are you?");
    int age = scan.nextInt();

    scan.nextLine(); // ad nextLine after next int to run the code next.
    System.out.println("Make a username");  
    String userName = scan.nextLine();

    System.out.println("\nWhat city do you live in?");
    String city = scan.nextLine();

    System.out.println("\nWhat Country do you live in?");
    String country = scan.nextLine();

    System.out.println("\nThank you for joining Javagram.");
    System.out.println("\nHere is the information you entered:");

    System.out.println("\nFirst Name: " + firstName);
    System.out.println("Last Name: " + lastName);
    System.out.println("Age: " + age);
    System.out.println("Country: " + country);
    System.out.println("City: " + city);
    System.out.println("User Name: " + userName);

    scan.close();

   
    System.out.println("\n\nYou are all set! Hooray.");

  }
  
}