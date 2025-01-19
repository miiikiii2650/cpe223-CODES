import java.io.*;

public class Act31_PositiveNegativeZero {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int input = 0;
        
        System.out.println("Please enter a number:");

        try {
            input = Integer.parseInt(dataIn.readLine());
        } catch (IOException e) {
            System.out.println("Error reading input!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
            return;
        }

        System.out.println("Displaying result...");
        String stat = (input > 0)? "Positive" : 
                      (input < 0)? "Negative" : "Invalid input";
        System.out.println(stat);
    }
}
