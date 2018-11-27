import java.lang.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args ){

        System.out.println("proof of life");

        int dogCount = 1;

        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount =2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount)+ ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount)+ ".");

        flipNHeads(1);
        clock();

    }

    public static String pluralize(String firstParam, int secondParam){
        if (secondParam <= 1){
             return firstParam;
        }
        else {
            return (firstParam + "s");
        }

    }

    public static void flipNHeads(int numberOfTimesFlipped) {
        for (int i = 0; i < numberOfTimesFlipped; i++) {
            int tails = 0;
            int heads =0;
            if (Math.random() < 0.5) {
                tails++;
                System.out.println("tails");
            } else {
                heads++;
                System.out.println("heads");
            }
            System.out.println("It took " + (tails + heads) + " to flip " + heads + " head in a row.");
        }
    }

    public static void clock() {


        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LocalDateTime currentTime = LocalDateTime.now();
            String time = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);

        }
    }
}
