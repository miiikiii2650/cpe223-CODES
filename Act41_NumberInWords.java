import javax.swing.JOptionPane;

public class Act41_NumberInWords {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number between and 10: ");
        int num = Integer.parseInt(input);
        String numW = "";

        if (num >= 1 && num <= 10)
        {
            switch (num)
        {
            case 1:
                numW = "One";
                break;
            case 2:
                numW = "Two";
                break;
            case 3:
                numW = "Three";
                break;
            case 4:
                numW = "Four";
                break;
            case 5:
                numW = "Five";
                break;
            case 6:
                numW = "Six";
                break;
            case 7:
                numW = "Seven";
                break;
            case 8:
                numW = "Eight";
                break;
            case 9:
                numW = "Nine";
                break;
            case 10:
                numW = "Four";
                break;
            default:
                System.out.println("");
                break;
        }
        JOptionPane.showMessageDialog(null, "The number in words is " + numW);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid Number");
        }
    }
}
