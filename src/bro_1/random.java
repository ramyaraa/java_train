package bro_1;

import java.util.Random;

public class random {
    public static void main(String[] args) {

        Random rand = new Random();

        // this is generate random number between [0,6]
        int a = rand.nextInt(6)+1;

        //this is generated random number between [5,10]
        int b = rand.nextInt(4,10)+1;

        //this is generated random number between [0,0.0009]
        double c = rand.nextDouble();

        // this is generated random bollean ture or false
        boolean d = rand.nextBoolean();

        //
        long e = rand.nextLong();

        System.out.println("this is random number between [0,6]: "+a);
        System.out.println("this is random number between [5,10]: "+b);
        System.out.println("this is random number between [0,0.9]`: "+c);
        System.out.println("this is random true or false   : "+d);
        System.out.println("this is random huge number because it's long: "+e);





    }
}