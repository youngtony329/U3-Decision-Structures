import javax.swing.*;
import java.util.Random;

public class QuizGame {


    static int usersAnswer, correctAnswer;
    static String displayProblem = "";

    public static void main(String[] args) {

    }

    public static void showResults() {
        JOptionPane.showMessageDialog(null, displayProblem);
    }


    public static void checkAnswer() {
        if (usersAnswer == correctAnswer) {
            displayProblem = "You are correct";
        } else {
            displayProblem = "Incorrect. Try again.";

        }

    }


    public static void getUserAnswer() {

        usersAnswer = input(displayProblem);
    }


    public static void createProblem() {


        int choice = input("Choose: \nAddition(1)\nSubtraction(2)\nMultiplication(3)\nDivision(4)");

        if (choice <= 4) {
            if (choice >= 1) {

                if (choice == 1) {
                    addProblem();
                }

                if (choice == 2) {
                    subProblem();
                }

                if (choice == 3) {
                    multProblem();
                }
                if (choice == 4) {
                    divideProblem();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid, please try again ");
                System.exit(0);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Invalid, please try again.");
            System.exit(0);
        }
    }


    public static void addProblem() {

        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1 + num2;
        displayProblem = num1 + " + " + num2;
    }

    public static void subProblem() {

        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1 - num2;
        displayProblem = num1 + " - " + num2;
    }


    public static void multProblem() {

        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1 * num2;
        displayProblem = num1 + " X " + num2;
    }


    public static void divideProblem() {

        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1 / num2;
        displayProblem = num1 + " / " + num2;
    }

    //Helper Method
    public static int randomNum() {
        Random random = new Random();
        return random.nextInt(20) + 1;

    }

    public static int input(String message) {

        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }
}



