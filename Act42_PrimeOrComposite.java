import javax.swing.JOptionPane;

public class Act42_PrimeOrComposite {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number: ");
        int num = Integer.parseInt(input);

        if (num ==1)
        {
            JOptionPane.showMessageDialog(null, "Not a Prime or Composite");
        }
        else if(num == 2)
        {
            JOptionPane.showMessageDialog(null, "Is the only even prime number");
        }
        else if(num < 3 && (num % 6 == 1 || num % 6 == 5)) 
        {
            JOptionPane.showMessageDialog(null, "Prime Number");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Composite Number");
        }
    }
}
