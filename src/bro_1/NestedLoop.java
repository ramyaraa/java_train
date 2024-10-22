package bro_1;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("how many row and coulumn did you wannt: ");
        int n = input.nextInt();
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
