package bro_1;

import java.util.Scanner;

public class doWhileLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("how many times loop it: ");
        int i = input.nextInt();

        do {
            if(i<0){
                System.out.println("don't use negative number!!");
            }
            System.out.println("hi your nothing");
            i--;
        }while (i > 0);
    }
}
