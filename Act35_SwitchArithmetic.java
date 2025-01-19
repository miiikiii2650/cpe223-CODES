import java.util.Scanner;

public class Act35_SwitchArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1st number:");
        int num1 = scanner.nextInt();
        System.out.println("Please enter 2nd number:");
        int num2 = scanner.nextInt();
        System.out.println("Please enter operator:");
        String operator = scanner.next();
        int result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("Sum: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Difference: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Product: " + result);
                break;
            case "/":
                result = num1 + num2;
                System.out.println("Qoutient: " + result);
                break;
            default:
                System.out.println("Invalid Operators");
                break;
        }
        scanner.close();
    }
}
