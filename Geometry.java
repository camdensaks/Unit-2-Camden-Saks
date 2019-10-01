 


/**
 * Write a description of class Geometry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Geometry
{
    public static void main(String[] args){
        int sides = 7;
        int radius = 5;
        final double PI = 22/7;
        System.out.println("A heptagon has " + sides + " sides.");
        System.out.println("A Decagon has " + (sides + 3) + " sides.");
        System.out.println("A Dodecagon has " + (sides + radius) + " sides.");
        System.out.println("The circumference of a circle with radius " + radius + " is " + (2*PI*radius));
    }
}    