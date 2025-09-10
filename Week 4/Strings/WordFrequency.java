import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
     public static void countWords(String sentence) {
        String[] words = sentence.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
        Map<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        for (String key : freq.keySet()) {
            System.out.println(key + ": " + freq.get(key));
        }
    }

    public static void main(String[] args) {
        countWords("The cat and the dog.");
    }
}
