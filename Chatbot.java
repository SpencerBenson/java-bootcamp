import java.util.Scanner;

public class Chatbot {
  public static void main(String[] args){

    // instantiate scanner
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to Chatbot!");
    System.out.println("Hello. What is your name?");

    String name = scan.nextLine();
    System.out.println("Hi " + name + "! I'mm Javabot. Where are you from?");

    String city = scan.nextLine();
    System.out.println("I hear it's beautiful at " + city + "! I'm from a place called Oracle. How old are you?");
    
    int age = scan.nextInt();

    scan.nextLine();
    System.out.println("\nSo you are  " + age + " years old.\nThat means I'm " + (400/age) + " times older than you. \nI'm 400years old.");
    

    System.out.println("\nEnough about me. What is your favorite programming language?(Just don't say Python)");
    
    String language = scan.nextLine();

    System.out.println("\n" + language + "!That's great! Nice chatting with you " + name + ". I have to logoff now. see you." );
    scan.close();






  }
  
}