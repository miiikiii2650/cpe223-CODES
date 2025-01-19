import java.io.*;

public class Act45_ForLoop {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int input = 0;
        
        System.out.println("Enter an Integer:");

        try {
            input = Integer.parseInt(dataIn.readLine());
        } catch (IOException e) {
            System.out.println("Error reading input!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
            return;
        }

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(input + " x " + i + " = " + (input * i));
        }
    }
}
