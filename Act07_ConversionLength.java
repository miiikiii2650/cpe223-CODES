public class Act07_ConversionLength {
    public static void main(String[] args) {
        System.out.println("Values to be converted to Meter:");
        int Kilometer = 15;
        int Centimeter = 850;
        int Millimeter = 1000000;

        System.out.println(Kilometer + "\tKilometer");
        System.out.println(Centimeter + "\tCentimeter");
        System.out.println(Millimeter + "\tMillimeter\n");

        System.out.println("Computing the Result...");
        int Km = Kilometer*1000;
        int Cm = Centimeter/100;
        int Mm = Millimeter/100;
        System.out.println( Kilometer+"km = " + Km + "m");
        System.out.println( Centimeter+"cm = " + Cm + "m");
        System.out.println( Millimeter+"mm = " + Mm + "m");
    }
}
