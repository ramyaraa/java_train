package Warmup_1;

/*
Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.
*/
import java.util.Scanner;

public class diff21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to know the difference with 21: ");
        int n = input.nextInt();

        int result = different(n);
        System.out.println("The difference is: " + result);

    }

    public static int different (int n) {
        int x;
        if(n<=21){
            x= 21-n;
            if(x<0){
                x = x*-1;
            }
            return x;
        }
        else{
            x= (21-n)*2;
            if(x<0){
                x = x*-1;
            }
            return x;
        }
    }
}
