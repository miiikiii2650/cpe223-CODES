import java.io.*;

public class Act30_RomanNumerals {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int input = 0;
        
        System.out.println("Enter a number:");

        try {
            input = Integer.parseInt(dataIn.readLine());
        } catch (IOException e) {
            System.out.println("Error reading input!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
            return;
        }

        System.out.println("Displaying result...");
        String stat = (input == 1)? "I" : 
                      (input == 5)? "V" :
                      (input == 10)? "X":
                      (input == 50)? "L" :
                      (input == 100)? "C" :
                      (input == 500)? "D" :
                      (input == 1000)? "M" : "Input not included";
        System.out.println(stat);
    }
}
