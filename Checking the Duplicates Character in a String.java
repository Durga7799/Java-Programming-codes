import java.util.HashMap;
import java.util.Map;
public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {  
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Character '" + entry.getKey() + "' has a duplicate count of " + entry.getValue());
            }
        }
    }
}
