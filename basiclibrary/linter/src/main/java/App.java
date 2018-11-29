import java.util.*;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public static void main(String[] args) {

        // Daily average temperatures for Seattle, October 1-28 2017
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

//        List<String> votes = new ArrayList<>();
//        votes.add("Bush");
//        votes.add("Bush");
//        votes.add("Bush");
//        votes.add("Shrub");
//        votes.add("Hedge");
//        votes.add("Shrub");
//        votes.add("Bush");
//        votes.add("Hedge");
//        votes.add("Bush");
//
//        String winner = tally(votes);


        System.out.println(new App().getGreeting("Hello!"));
//        printMinMaxAndMissingData(weeklyMonthTemperatures);
//        System.out.println(winner + " received the most votes!");

    }

    public static String getGreeting(String message) {
        return message;
    }


    public static int getMaxValue(HashSet<Integer> missingElement) {
        return Collections.max(missingElement);
    }

    public static int getMinValue(HashSet<Integer> missingElement) {
        return Collections.min(missingElement);
    }


    public static HashSet<Integer> getMissingElement(int[][] dimensionalData) {
        HashSet<Integer> missingElement = new HashSet();
        for (int[] arrayOfInts : dimensionalData) {
            for (int value : arrayOfInts) {
                if (!missingElement.contains(value)) {
                    missingElement.add(value);
                }
            }
        }
        return missingElement;
    }


    public static void printMinMaxAndMissingData(int[][] dimensionalDataArray) {
        HashSet<Integer> uniqueElement = getMissingElement(dimensionalDataArray);
        int maxValue = getMaxValue(uniqueElement);
        int minValue = getMinValue(uniqueElement);

        System.out.println("Low: " + maxValue);
        System.out.println("High: " + minValue);

        for (int i = minValue; i <= maxValue; i++) {
            if (!uniqueElement.contains(i)) {
                System.out.println("Never saw temperature: " + i);
            }
        }
    }

//    public static void List <String> tally (List<String> votesParameter){
//        Map<String, Integer> votesMap = new HashMap<>();
//
//        for(String candidate : votesParameter){
//            if(! votesMap.containsKey(candidate)){
//                votesMap.put(candidate, 1);
//            }
//            else{
//                int vote = votesMap.get(candidate);
//                vote++;
//
//                votesMap.put(candidate, vote);
//            }
//        }
//
//        List <String> mostVotes = new ArrayList<>();
//        for (Map.Entry<String, Integer> element : votesMap.entrySet()){
//            if (element.getValue() == Collections.max(votesMap.values())){
//
//                mostVotes.add(element.getKey()) ;
//            }
//            System.out.println(mostVotes);
//        }
//
//
//    }

}






