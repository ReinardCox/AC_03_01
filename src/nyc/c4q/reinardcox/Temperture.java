package nyc.c4q.reinardcox;

import java.util.Scanner;

/**
 * Created by Shadow on 3/11/2015.
 */
public class Temperture {
    public static void main (String [] args){

        System.out.print("Convert Celsius into Fahrenheit: ");
        Scanner inputX = new Scanner(System.in);
        float temp = inputX.nextInt();

        //math multiply by 9, Divide by 5 and add 32.

        temp = (temp * 9) / 5 + 32;

        System.out.println("The temperture is: " + temp + "°F");

    }

}
