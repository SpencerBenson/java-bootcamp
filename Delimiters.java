import java.util.Scanner;
public class Delimiters {
  /**
   * Delimiters skip white space and pick the next value they see.
   * they are: nextInt, nextLong, nextDouble and next
   * nextLine picks the whole line you key in
   * In the code below, on prompt, enter the values seperated
   * by space.
   * @param args
   */
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two integers on the same line");
    int number1 = scan.nextInt();
    int number2 = scan.nextInt();
    scan.nextLine();

    System.out.println("Enter two very big integers  on the same line");
    long bigNumber1 = scan.nextLong();
    long bigNumber2 = scan.nextLong();

    System.out.println("Enter two decimals on the same line");
    double decimal1 = scan.nextDouble();
    double decimal2 = scan.nextDouble();

    System.out.println("Enter two text values on the same line");
    String text1 = scan.next();
    String text2 = scan.next();
    scan.close();

    System.out.println("\tIntegers are: " + number1 + " " + number2);
    System.out.println("\tBig Integers are: " + bigNumber1 + " " + bigNumber2);
    System.out.println("\tDecimals are: " + decimal1 + " " + decimal2);
    System.out.println("\tWords are: " + text1 + " " + text2);
  }
  
}