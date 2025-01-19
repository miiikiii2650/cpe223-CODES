public class Act19_OddOrEven {
    public static void main(String[] args) {
        int num1 = 1778;

        System.out.println("Printing integer...");
        System.out.println(num1);

        String res = (num1 % 2 == 0)? "EVEN" : "ODD";
        System.out.println("Result: " + res);
    }
}
