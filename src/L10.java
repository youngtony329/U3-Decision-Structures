import javax.swing.*;

public class L10 {

    public static void main(String[] args){
        int n = JOptionPane.showOptionDialog(null,
                "Are you 16 years old or older?",
                "Age?",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

        String message = n == JOptionPane.YES_OPTION?"You are allowed to drive.":"You cannot drive.";

        JOptionPane.showMessageDialog(null, message);

    }
}
