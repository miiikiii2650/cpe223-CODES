import java.util.Scanner;

public class Act32_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        String num = scanner.nextLine();

        if (num.isEmpty()) 
        {
            System.out.println("Please input a number"); 
        }
        else if (num.length() > 7) {
            System.out.println("Number exceeds the limit"); 
        }
        else
        {
            System.out.println("Evaluating...");
            System.out.println(num.length() + " digits");
        }
        scanner.close();
        
    }
}
