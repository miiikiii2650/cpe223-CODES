public class Act18_PassOrFail {
    public static void main(String[] args) {
        double sg = 74.5;

        System.out.println("Printing grade...");
        System.out.println(sg);
        System.out.println("Evaluating...");
        String stat = (sg >= 75)? "PASS" : "FAILED";
        System.out.println("Result: " + stat);
    }
}
