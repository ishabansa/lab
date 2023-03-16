//Q.2 Write a java program to reverse every word in string.
package Lab;

public class Reverse_String { //main class
	public static void main(String[] args) { //main method
        String inputString = "Welcome";
        String reversedString = reverseWords(inputString);
        System.out.println("Reversed string: " + reversedString);
    }
    public static String reverseWords(String str) {
        String[] words = str.split("\\s");
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedString.append(reversedWord).append(" ");
        }
        return reversedString.toString().trim();
    }
}
