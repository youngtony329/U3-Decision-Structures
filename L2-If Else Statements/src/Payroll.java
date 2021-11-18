import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.text.DecimalFormat;

public class Payroll {

    /*
    This program should calculate an employee's pay
    which includes overtime pay.

    Overtime pay is any hours over 40 gets a wage equal
    to 1.5 times base wage.

    BASE WAGE: 12.50
    OVERTIME WAGE: 18.75

    HOURS WORKED: 50
    HOURS: 40 NORMAl, 10 OVERTIME
    PAY: 40 * 12.50 + 10 * 18.75 = 687.50

    Let's output this in proper currency form.
     */

    public static void main(String[] args) {

        


    }

    public static double normalWage(double hours, double rate){

        return hours*rate;
    }

    public static double overtimeWage(double hours, double rate){

        double overtime = hours - 40;

        return (40 * rate) + (overtime * (rate * 1.5));
    }

    public static double input(String prompt){

        return Double.parseDouble(JOptionPane.showInputDialog(prompt));
    }

    public static void output(double wage){

        DecimalFormat round = new DecimalFormat("#,###.00");

        JOptionPane.showMessageDialog(null, "Your wage is " + round.format(wage));
    }
}
