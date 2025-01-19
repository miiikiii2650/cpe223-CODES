public class Act17_ConditionalOperators {
    public static void main(String[] args) {
        int eng = 75;
        int sci = 80;
        int mt = 90;

        System.out.println("Printing grade...");
        System.out.println("English\t" + eng);
        System.out.println("Science\t" + sci);
        System.out.println("Math\t" + mt);

        int ave = (eng + sci + mt)/3;
        System.out.println("Average Grade: " + ave);
        
        String op = (ave >= 75)? "Pass" : "Fail";
        System.out.println("Status: " + op);
    }
}
