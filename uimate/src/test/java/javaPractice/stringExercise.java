package javaPractice;
import java.util.HashMap;
import java.util.Map;

public class stringExercise {
    public static void main(String[] args) {
        String inputString = "aabccc"; // Replace with your desired string

        // Create a HashMap to store character counts
        Map<Character, Integer> characterCountMap = new HashMap<>();

        // Iterate through each character in the string
        for (char c : inputString.toCharArray()) {
            characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the second highest count
        int secondHighestCount = 0;
        for (int count : characterCountMap.values()) {
            if (count > secondHighestCount && count != characterCountMap.values().stream().max(Integer::compare).get()) {
                secondHighestCount = count;
            }
        }

        // Print characters with the second highest count
        System.out.println("Characters with the second highest count:");
        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            if (entry.getValue() == secondHighestCount) {
                System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
            }
        }
    }
}
