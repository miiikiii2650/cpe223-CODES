import java.io.*;

public class Act28_TestIfElseIf {
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
        String stat = (input <= 100 && input > 90)? "Excellent" : 
                      (input <= 90 && input > 80)? "Superior" :
                      (input <= 80 && input >= 70)? "Satisfactory":
                      (input <= 70 && input >= 0)? "Failed" : "Invalid Input ";
        System.out.println(stat);
    }
}
