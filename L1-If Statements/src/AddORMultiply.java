import javax.swing.*;

public class AddORMultiply {

    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, mutiply and display the result
    If not, add them and display the results.
     */

    public static void main(String[] args) {


    }

    public static int adding() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Give me 1 number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Give me another number"));
        int adding = num1 + num2;

        return adding;
    }


    public static int multiply(){

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Give me 1 number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Give me another number"));

        int multiplication = num1 * num2;

        return multiplication;
    }
}


