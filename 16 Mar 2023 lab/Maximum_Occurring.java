//Q.1 Write a java program to find the maximum occurring character in a string.
package Lab;
import java.util.HashMap;
import java.util.Map;
public class Maximum_Occurring { //main class
public static void main(String[] args) { //main method
        String inputString = "Welcome";
        char maxChar = getMaxOccurringChar(inputString);
        System.out.println("Maximum occurring character in a string: \"" + inputString + "\" is '" + maxChar + "'");
    }
    public static char getMaxOccurringChar(String str) {
        // Create a hash map to store character counts
        Map<Character, Integer> charCounts = new HashMap<Character, Integer>();
        // Iterate through the string and count each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = charCounts.getOrDefault(ch, 0);
            charCounts.put(ch, count + 1);
        }
        // Find the character with the highest count
        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount) {
                maxChar = ch;
                maxCount = count;
            }
        }
        return maxChar;
    }
}
