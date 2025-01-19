import java.io.*;

public class Act26_TestIf {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int input = 0;
        
        System.out.println("Enter a grade:");

        try {
            input = Integer.parseInt(dataIn.readLine());
        } catch (IOException e) {
            System.out.println("Error reading input!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
            return;
        }

        System.out.println("Evaluating...");
        String stat = (input >= 75)? "PASS" : "FAILED";
        System.out.println(stat);
    }
}
