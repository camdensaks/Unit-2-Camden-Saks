import java.util.Random;

public class phoneNumber {
  public static void main(String[] args){
    Random rand = new Random();
    //area code
    int first = rand.nextInt(7) + 2;
    int second = rand.nextInt(9);
    int third = rand.nextInt(10);
    String areaCode = "" + first + second + third ;
    //exchange code
    int fourth = rand.nextInt(7) + 2;
    int fifth = rand.nextInt(10);
    int sixth = rand.nextInt(10);
    String exchangeCode = "" + fourth + fifth + sixth;
    //line number
    int seventh = rand.nextInt(10);
    int eighth =  rand.nextInt(10);
    int ninth =   rand.nextInt(10);
    int tenth = rand.nextInt(10);
    String lineNumber = "" + seventh + eighth + ninth + tenth;
    System.out.println("Phone Number: " + "(" + areaCode + ")" + exchangeCode + "-" + lineNumber);
  }
}
