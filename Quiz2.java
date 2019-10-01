import java.util.Scanner;
import java.util.Random;

public class Quiz2 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    System.out.println(" Please provide a number between 1 and 100: ");
    int num1 = scan.nextInt();
    int num2 = rand.nextInt(100) + 1;
    int num3 = Math.abs(num2 - num1) ;
    System.out.println("Your number: " + num1);
    System.out.println("Randomly Generated Number: " + num2);
    System.out.println("Your lucky number is the absolute value of the difference of these two numbers! " + num3);
  }
}
