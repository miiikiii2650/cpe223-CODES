import java.util.Scanner;

public class Act29_SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three digit number: ");
        int num = scanner.nextInt();

        if (num >= 100 && num <= 999) {
            System.out.println("Evaluating...");

            int hundreds = num/100;
            int tens = (num % 100)/10;
            int ones = num % 10;
            System.out.println(hundreds);
            System.out.println(tens);
            System.out.println(ones);

            int sum = ones + tens + hundreds;
            System.out.println("Computing for the sum of the digits");
            System.out.println(sum);
        }
        else
        {
            System.out.println("Please input a three digit number.");
        }
        scanner.close();
        
    }
}
