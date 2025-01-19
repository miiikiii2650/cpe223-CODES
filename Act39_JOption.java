import javax.swing.JOptionPane;

public class Act39_JOption {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter name: ");
        String msg = "Hello " + name + "!";
        System.out.println("Hello " + name + "!");
        JOptionPane.showMessageDialog(null,msg);
    }
}
