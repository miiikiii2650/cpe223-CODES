import javax.swing.JOptionPane;

public class Act49_GeometricNumberSequence {
    public static void main(String[] args) {
        String first = JOptionPane.showInputDialog("Enter the first term:");
        String ratio = JOptionPane.showInputDialog("Enter the common ratio:");

        int a1 = Integer.parseInt(first);
        int r = Integer.parseInt(ratio);
        int n = 1;
        int an;
        
        System.out.println("Printing Geometric Sequence...");

        while (n <= 10) {
            an = (int) (a1 * Math.pow(r, n - 1));
            System.out.println(an + " ");
            n++;
        }
    }
}
