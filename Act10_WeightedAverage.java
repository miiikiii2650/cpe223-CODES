public class Act10_WeightedAverage {
    public static void main(String[] args) {
        int mtg = 85, scg = 90, pe = 99;

        System.out.println("Printing Subject Grade...");
        System.out.println("Math: \t" + mtg);
        System.out.println("Science: " + scg);
        System.out.println("PE: \t" + pe);
        System.out.println(" ");


        int mt = 85 * 3;
        int sc = 90 * 4;
        int p = 99 * 2;
        System.out.println("Computing Weighted Average...");
        double ave = (mt + sc + p)/9;
        System.out.println("Result: " + ave);

    }
}
