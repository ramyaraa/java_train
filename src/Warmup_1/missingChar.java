package Warmup_1;

import java.util.Scanner;

public class missingChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String str = input.nextLine();
        System.out.print("enter the index: ");
        int n = input.nextInt();

        String result = missingChar(str, n);
        System.out.println("this is the output: " + result);

    }
    public static String missingChar(String str, int n) {
        String test = "";
        for (int i = 0; i < str.length(); i++) {
            if(i == n){
                continue;
            }
            else{
                test += str.charAt(i);
            }
        }
        return test;
    }
}
