import java.io.*;

public class Act23_Last3Words {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String first = "";
        String second = "";
        String third = "";

        System.out.println("Enter the 1st word:");

        try {
            first = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }

        System.out.println("Enter the 2nd word:");

        try {
            second = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }

        System.out.println("Enter the 3rd word:");

        try {
            third = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }

        System.out.println("\nPrinting your last three words!");
        System.out.println(first + " " + second + " " + third);
    }
}
