import java.util.HashMap;

public class StringDemo11223 {

    static String s = "Bangalore";

    public static void CountChar() {
        // Create a HashMap to store the character and its count
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If the character is already in the map, increment its count
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // If the character is not in the map, add it with a count of 1
                charCountMap.put(ch, 1);
            }
        }

        // Print the characters and their occurrences
        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        CountChar();
    }
}
