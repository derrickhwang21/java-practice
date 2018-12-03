import java.lang.*;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args ){


        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount =2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount)+ ".");
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount)+ ".");

        flipNHeads(2);

        clock();

        
    }

    public static String pluralize(String firstParam, int secondParam){
        if (secondParam > 0 && secondParam < 2){
             return firstParam;
        }
        else {
            return (firstParam + "s");
        }

    }


    public static void flipNHeads(int numberOfTimesFlipped) {

        Random r = new Random();
        double nextRandom = r.nextDouble();
        int tails = 0;
        int heads =0;

        while (heads < numberOfTimesFlipped){
            if (nextRandom < 0.5) {
                tails++;
                heads = 0;
                System.out.println("tails");
            } else {
                heads++;
                System.out.println("heads");
            }
            nextRandom = r.nextDouble();

        }
        System.out.println("It took " + (tails + heads) + "flips to flip " + heads + " head in a row.");
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
