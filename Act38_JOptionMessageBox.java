import javax.swing.JOptionPane;

public class Act38_JOptionMessageBox {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter name: ");
        System.out.println("Hello " + name + "!");
        String msg = "Hello!";
        JOptionPane.showMessageDialog(null,msg);
    }
}
