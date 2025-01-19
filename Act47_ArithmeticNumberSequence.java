public class Act47_ArithmeticNumberSequence {
    public static void main(String[] args) {
        int first = 4;
        int comdef = 3;
        int count = 0;

        while (count < 10) {
            System.out.println(first);
            first += comdef;
            count++;
        }
    }
}
