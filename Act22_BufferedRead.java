import java.io.*;

public class Act22_BufferedRead {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String input;
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("Enter a single character:");

        try {
            input = dataIn.readLine();
            if (input.length() != 1) {
                System.out.println("Error: Please enter only one character.");
                return;
            }

            char letter = input.charAt(0);
            boolean isAVowel = (new String(vowels).contains(Character.toString(letter)));

            System.out.println("Evaluating...");
            System.out.println("Result: " + (isAVowel ? "Vowel" : "Consonant"));
        } catch (IOException e) {
            System.out.println("Error reading input!");
        }
    }
}