package Warmup_1;
/*
This problem is asking whether the given number n is close to either 100 or 200,
specifically within a range of 10 units from those numbers.
 */
//
//Explanation: if number betwwen 90 and 110 it near hundred


import java.util.Scanner;

public class nearHundred {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = input.nextInt();

        boolean result = nearh(n);
        if (result) {
            System.out.print("the number is near hundred");
        }else{
            System.out.println("the number is not near hundred");
        }

    }
    public static boolean nearh(int n) {
        if(n >= 90 && n <= 110){
            return true;
        }else if (n >=190 && n <= 210){
            return true;
        }
        else{
            return false;
        }
    }
}
