import java.util.Scanner;

public class Act36_SwitchRomanNumerals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();
        char result = '\0';

        switch (number) {
            case 1:
                result = 'I';
                break;
            case 5:
                result = 'V';
                break;
            case 10:
                result = 'X';
                break;
            case 50:
                result = 'L';
                break;
            case 100:
                result = 'C';
                break;
            case 500:
                result = 'D';
                break;
            case 1000:
                result = 'M';
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println("Displaying result...");
        System.out.println(result);
        scanner.close();
    }
}
