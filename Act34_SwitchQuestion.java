import java.util.Scanner;

public class Act34_SwitchQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java keywords used to prevent Switch statement to execute the succeeding block of codes");
        System.out.println("A. Break\nB. Case\nC. Switch\nD. Default");
        System.out.println("Please input your answer: ");
        char ans = scanner.nextLine().charAt(0);
        String result = "";

        switch (ans) {
            case 'A':
            case 'a':
                result = "CORRECT";
                break;
            default:
                System.out.println("Incorrect");
                break;
        }
        System.out.println(result);
        scanner.close();
    }
}
