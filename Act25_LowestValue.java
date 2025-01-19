import java.util.Scanner;

public class Act25_LowestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 1st number: ");
        int num1 = scanner.nextInt();

        System.out.println("Please enter 2nd number: ");
        int num2 = scanner.nextInt();

        System.out.println("Please enter 3rd number: ");
        int num3 = scanner.nextInt();

        int lowest = num1;
        if (num2 < lowest) {
            lowest = num2;
        }
        if (num3 < lowest) {
            lowest = num3; 
        }

        System.out.println("The lowest value is: " + lowest);
        scanner.close();
        
    }
}
