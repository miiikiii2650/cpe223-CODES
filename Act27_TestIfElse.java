import java.util.Scanner;

public class Act27_TestIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a grade: ");
        int num1 = scanner.nextInt();

        System.out.println("Evaluating...");
        String stat = (num1 >= 75)? "PASS" : "FAILED";
        System.out.println(stat);
        scanner.close();
        
    }
}
