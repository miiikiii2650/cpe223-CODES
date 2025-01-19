public class Act21_VowelsOrConsonant {
    public static void main(String[] args) {
        char letter = 'm';
        char vowels[] = {'a', 'e', 'i' ,'o','u'};

        System.out.println("Printing character...");
        System.out.println(letter);

        boolean isAVowel = (new String(vowels).contains(Character.toString(letter)))? true: false;

        System.out.println("Evaluating...");
        System.out.println("Result: " + (isAVowel? "Vowel": "Consonant"));
    }
}