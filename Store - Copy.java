import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class Store {

    public static void main(String [] args){
      Scanner input = new Scanner(System.in);
      String store = "Steve's Mart";
      String cashierName = "Steve";
      System.out.println(store);
      System.out.println(cashierName);
      Random rand = new Random();
      System.out.println("Month: " + (rand.nextInt(12) + 1));
      System.out.println("Day: " + (rand.nextInt(28) + 1));
      System.out.println("Time: " + (rand.nextInt(24)));
      System.out.println("Year: 2019 ");
      double books = 9.0;
      double movies = 13.97;
      double peanuts = 1.72;

      double shipbook = 0.95;
      double shipmovies = 0.04;
      double shippeanuts = 0.30;
      double tax = 0.072;

      System.out.println("Number of books bought: " );
      int BooksBought = input.nextInt();
      System.out.println("Number of movies bought: " );
      int MoviesBought = input.nextInt();
      System.out.println("Pounds of peanuts bought: " );
      int PeanutsBought = input.nextInt();

      System.out.println("Book Shipping Cost: " + shipbook);

      double bookstotal = (books * BooksBought) + (shipbook * BooksBought);
      double moviestotal = (movies * MoviesBought) + (shipmovies * MoviesBought);
      double peanutstotal = (peanuts * PeanutsBought) + (shippeanuts * PeanutsBought);
      double grandtotal = (bookstotal + moviestotal + peanutstotal);
      double salestotal = (grandtotal * tax);
      double finaltotal = (grandtotal + salestotal);
      System.out.println("Grand Total: " + grandtotal);
      System.out.println("Sales Tax: " + tax);
      System.out.println("Final Total: " + finaltotal);
    }
}
