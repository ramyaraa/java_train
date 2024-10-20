package bro_1;

public class Swaping_varabile {
    public static void main(String[] args) {
        String x = "watter";
        String y = "fanta";

        String temp = x;
        x=y;
        y=temp;

        System.out.println("tha value of x: "+x);
        System.out.println("tha value of y: "+y);


    }
}
