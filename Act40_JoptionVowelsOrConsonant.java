import javax.swing.JOptionPane;

public class Act40_JoptionVowelsOrConsonant {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a letter: ");
        char letter = input.charAt(0);
        String result;

        switch (Character.toLowerCase(letter))
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                result = letter + " is a vowel";
                break;
            default:
                result = Character.isLetter(letter) ? letter + " is a consonant." : "Please input a letter.";
        }
        JOptionPane.showMessageDialog(null, result);
    }
}
