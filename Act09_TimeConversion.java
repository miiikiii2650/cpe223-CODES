public class Act09_TimeConversion {
    public static void main(String[] args) {
        System.out.println("Units to be Converted to Minutes:");
        int Hour = 5;
        int Sec = 6000;
        System.out.println("Hours: " + Hour);
        System.out.println("Seconds: " + Sec);

        System.out.println("\nConverting to minutes...");
        System.out.println(Hour + " hours = " + (Hour * 60) + "mins");
        System.out.println(Sec + " Seconds = " + (Sec * 60) + "mins" );


    }
}
