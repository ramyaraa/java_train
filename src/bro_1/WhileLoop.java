package bro_1;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "";

        while(name.isBlank()) {
            System.out.print("please enter your name: ");
            name = input.nextLine();
        }
    }
}
