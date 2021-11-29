import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class QuizGame {


    static double usersAnswer, correctAnswer;
    static String displayProblem = "";
    static JPanel panel;
    static JButton newProblemButton, checkAnswerButton;
    static JTextField answerInput;
    static JLabel showProblem, showResults;
    JRadioButton addition, subtraction, multiplication, division;


    public static void main(String[] args) {


        new QuizGame();
        /*createProblem();
        getUserAnswer();
        checkAnswer();*/
    }

    public QuizGame(){

        JFrame frame = new JFrame("Quiz Game");
        frame.setSize(300, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        addition = new JRadioButton("Addition");
        subtraction = new JRadioButton("Subtraction");
        multiplication = new JRadioButton("Multiplication");
        division = new JRadioButton("Division");
        ButtonGroup radios = new ButtonGroup();
        newProblemButton = new JButton("Give me a problem");
        showProblem = new JLabel("PLACEHOLDER TEXT");
        checkAnswerButton = new JButton("Am I right?");
        showResults = new JLabel("PLACEHOLDER TEXT");
        answerInput = new JTextField(10);


        addition.setBounds(100, 10, 200, 30);
        subtraction.setBounds(100, 40, 200, 30);
        multiplication.setBounds(100, 70, 200, 30);
        division.setBounds(100, 100, 200, 30);
        newProblemButton.setBounds(75, 130, 150, 25);
        showProblem.setBounds(75, 160, 150, 25);
        answerInput.setBounds(75, 190, 150, 25);
        checkAnswerButton.setBounds(75, 220, 150, 25);
        showResults.setBounds(75, 250, 150, 25);

        radios.add(addition);
        radios.add(subtraction);
        radios.add(multiplication);
        radios.add(division);


        newProblemButton.addActionListener(new ProblemChoiceListener());
        checkAnswerButton.addActionListener(new CheckAnswerListener());

        addition.setSelected(true);



        panel.add(addition);
        panel.add(subtraction);
        panel.add(multiplication);
        panel.add(division);
        panel.add(newProblemButton);
        panel.add(showProblem);
        panel.add(answerInput);
        panel.add(checkAnswerButton);
        panel.add(showResults);


        frame.add(panel);
        panel.setLayout(null);
        frame.setVisible(true);

    }


    private class ProblemChoiceListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent){
            if(addition.isSelected()){
                addProblem();
            }
            if(subtraction.isSelected()){
                subProblem();
            }
            if(multiplication.isSelected()){
                multiProblem();
            }
            if(division.isSelected()){
                divideProblem();
            }

            showProblem.setText(displayProblem);
        }
    }


    private class CheckAnswerListener implements ActionListener{
        @Override

        public void actionPerformed(ActionEvent actionEvent){
            getUserAnswer();
            checkAnswer();
        }
    }



    public static void showResults() {
        JOptionPane.showMessageDialog(null, displayProblem);
    }


    public static void checkAnswer() {
        if (usersAnswer == correctAnswer) {
            showResults.setText("You are correct");
            panel.add(newProblemButton);
            panel.updateUI();
        } else {
            showResults.setText( "Incorrect. Try again.");

        }

    }


    public static void getUserAnswer() {

        usersAnswer = Double.parseDouble(answerInput.getText());
    }


    public static void createProblem() {


        int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose: \nAddition(1)\nSubtraction(2)\nMultiplication(3)\nDivision(4)"));

        if (choice <= 4) {
            if (choice >= 1) {

                if (choice == 1) {
                    addProblem();
                }

                if (choice == 2) {
                    subProblem();
                }

                if (choice == 3) {
                    multiProblem();
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


    public static void multiProblem() {

        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1 * num2;
        displayProblem = num1 + " X " + num2;
    }


    public static void divideProblem() {


        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = (double)num1 / num2;

        correctAnswer = Math.round(correctAnswer*100)/100.0;

        System.out.println(correctAnswer);

        displayProblem = num1 + " / " + num2;
    }

    //Helper Method
    public static int randomNum() {
        Random random = new Random();
        return random.nextInt(20) + 1;

    }

    public static double input(String message) {

        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }
}



