package bro_1;

import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("what is the base: ");
        double base = input.nextDouble();
        System.out.print("what is the the opposite: ");
        double opposite = input.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(opposite, 2));

        System.out.println("the hypotenuse is: " + hypotenuse);
    }
}
