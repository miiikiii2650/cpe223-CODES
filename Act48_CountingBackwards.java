import java.util.Scanner;

public class Act48_CountingBackwards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Counting Backwards...");
        while (num >= 0) {
            System.out.println(num);
            num--;
        }
        scanner.close();
        
    }
}
