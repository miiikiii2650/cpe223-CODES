import java.io.*;

public class Act24_Numbers {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int first = 0;
        int second = 0;

        System.out.println("Enter the 1st number:");

        try {
            first = Integer.parseInt(dataIn.readLine());
        } catch (IOException e) {
            System.out.println("Error reading input!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
            return;
        }

        System.out.println("Enter the 2nd number:");

        try {
            second = Integer.parseInt(dataIn.readLine());
        } catch (IOException e) {
            System.out.println("Error reading input!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
            return;
        }

        System.out.println("\nProcessing result...");
        int sum = first + second;
        System.out.println("Sum: " + sum);
        int diff = first - second;
        System.out.println("Difference: " + diff);
        int qou = first / second;
        System.out.println("Qoutient: " + qou);
        int pro = first * second;
        System.out.println("Product: " + pro);
    }
}