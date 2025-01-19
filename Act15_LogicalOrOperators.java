public class Act15_LogicalOrOperators {
    public static void main(String[] args){
        int i = 0;
        int j = 10;
        boolean test = false;

        System.out.println("Printing Variables...");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("test = " + test);
        System.out.println("\n");

        System.out.println("Demonstrating ||");
        test = (i == 0) || (j == 10);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("test = " + test);
        System.out.println("\n");

        System.out.println("Demonstrating |");
        j = j|1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("test = " + test + "\n");
    }
}
