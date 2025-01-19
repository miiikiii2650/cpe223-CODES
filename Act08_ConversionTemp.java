public class Act08_ConversionTemp {
    public static void main(String[] args) {
        System.out.println("Convert 20C to Fahrenheit");
        int C = 20;
        int F = 68;
        
        int TF = C*9/5+32;
        int TC = (F - 32)*5/9;

        System.out.println("Result: " + TF +  "F" );
        System.out.println("Convert 68F to Celsius");
        System.out.println("Result: " + TC + "C");

    }

}
