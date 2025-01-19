public class Act16_LogicalXorOperators {
    public static void main(String[] args) {
        boolean val1;
        boolean val2;
        boolean test;

        System.out.println("Displaying the TRUTH TABLE for XOR");
        System.out.println("x1\tx2\tRESULT");

        val1 = true; val2 = true;
        test = val1 ^ val2;
        System.out.println(format(val1) + "\t" + format(val2) + "\t" + test);

        val1 = true; val2 = false;
        test = val1 ^ val2;
        System.out.println(format(val1) + "\t" + format(val2) + "\t" + test);

        val1 = false; val2 = true;
        test = val1 ^ val2;
        System.out.println(format(val1) + "\t" + format(val2) + "\t" + test);

        val1 = false; val2 = false;
        test = val1 ^ val2;
        System.out.println(format(val1) + "\t" + format(val2) + "\t" + test);
    }
    public static String format(boolean value) {
        return value ? "TRUE" : "FALSE";
    }
}
