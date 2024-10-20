package bro_1;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is you name?");
        String name= input.nextLine();
        System.out.println("what is you age?");
        int age= input.nextInt();
        input.nextLine();
        System.out.println("what is you gender?");
        String gender= input.nextLine();

        System.out.println("hey whats up "+name);
        System.out.println("you are "+age+" years old");
        System.out.println("you are "+gender);

    }
}
