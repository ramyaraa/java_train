package bro_1;

import java.util.Scanner;

public class FunNestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int shapeNumber=0;
        while(shapeNumber != -1) {
            try{
                System.out.print("what shape did you want\n" +
                        "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                        "type 1 : for Squire\n" +
                        "type 2 : for triangle upper right\n" +
                        "type 3 : for triangle upper left\n" +
                        "type 4 : for triangle down right\n" +
                        "type 5 : for triangle down left\n" +
                        "________type  -1  to quite!________\n" +
                        "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                        "type here... : ");

                shapeNumber = input.nextInt();
                if (shapeNumber == -1) {
                    System.out.println("Thank you for using the shape generator. Goodbye!");
                    break;
                }
                System.out.print("ok. now hwo many pixels?: ");
                int pixels = input.nextInt();

                if (shapeNumber == 1) {
                    for (int row = 0; row < pixels; row++) {
                        for (int column = 0; column < pixels; column++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }

                } else if (shapeNumber == 2) {
                    for (int row = 0; row < pixels; row++) {
                        for (int column = 0; column < pixels; column++) {
                            if (row <= column) {
                                System.out.print("#  ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println();

                    }
                } else if (shapeNumber == 3) {
                    for (int row = 0; row < pixels; row++) {
                        for (int column = 0; column < pixels; column++) {
                            if (row + column <= pixels-1) {
                                System.out.print("#  ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println();
                    }
                } else if (shapeNumber == 4) {
                    for (int row = 0; row < pixels; row++) {
                        for (int column = 0; column < pixels; column++) {
                            if (row + column >= pixels-1) {
                                System.out.print("#  ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println();
                    }

                } else if (shapeNumber == 5) {
                    for (int row = 0; row < pixels; row++) {
                        for (int column = 0; column < pixels; column++) {
                            if (row >= column) {
                                System.out.print("#  ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println();
                    }
                }
                else {
                    System.out.println("wrong input");
                }
            } catch (Exception e) {
                System.out.println("Please enter valid numbers only.");
                input.next(); // Clear the invalid input
            }

        }
    }
}
