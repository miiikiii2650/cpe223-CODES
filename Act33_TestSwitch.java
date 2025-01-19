import java.util.Scanner;

public class Act33_TestSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Department Code: ");
        int code = scanner.nextInt();

        switch (code) {
            case 100:
                System.out.println("Business Administraion");
                break;
            case 101:
                System.out.println("Accountancy");
                break;
            case 102:
                System.out.println("Marine Engineering");
                break;
            case 103:
                System.out.println("Civil Engineering");
                break;
            case 104:
                System.out.println("Senior High School");
                break;
            default:
                System.out.println("Please input numbers 100 - 104.");
                break;
        }
        scanner.close();
    }
}
