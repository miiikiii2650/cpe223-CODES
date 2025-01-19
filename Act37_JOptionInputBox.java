import javax.swing.JOptionPane;

public class Act37_JOptionInputBox {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter name: ");
        System.out.println("Hello " + name + "!");
    }
}
