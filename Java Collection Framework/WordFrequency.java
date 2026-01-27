import java.util.Map;
import java.util.TreeMap;
public class WordFrequency {
    public static void main(String[] args) {
        String text = "hello world this is a test this is only a test hello";
        System.out.println("Input Text: " + text);
        TreeMap<String, Integer> frequencyMap = countWords(text);
        System.out.println("\nWord Frequencies (Sorted):");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static TreeMap<String, Integer> countWords(String text) {
        TreeMap<String, Integer> map = new TreeMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }
}