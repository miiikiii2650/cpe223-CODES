public class Act20_GreatestValue {
    public static void main(String[] args) {
        int num1 = 1000;
        int num2 = 113;
        int num3 = 1599;

        System.out.println("Printing variables...");
        System.out.println("number 1: " + num1);
        System.out.println("number 2: " + num2);
        System.out.println("number 3: " + num3);

        System.out.println("\nEvaluating...");
        int stat = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println(stat + " is the greatest value");
    }
}
