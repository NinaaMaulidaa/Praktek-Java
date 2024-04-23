/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author thinpad
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorGUI extends JFrame {
    private JTextField displayTextField;
    private JButton button7, button8, button9, buttonDivide,
            button4, button5, button6, buttonMultiply,
            button1, button2, button3, buttonSubtract,
            button0, buttonDecimal, buttonEquals, buttonAdd;

    public CalculatorGUI() {
        initComponents();
    }

    private void initComponents() {
        displayTextField = new JTextField();
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonDivide = new JButton("/");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        buttonMultiply = new JButton("*");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        buttonSubtract = new JButton("-");
        button0 = new JButton("0");
        buttonDecimal = new JButton(".");
        buttonEquals = new JButton("=");
        buttonAdd = new JButton("+");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLayout(null);

        displayTextField.setFont(new Font("Tahoma", Font.BOLD, 18));
        displayTextField.setHorizontalAlignment(JTextField.RIGHT);
        displayTextField.setEditable(false);
        displayTextField.setBounds(10, 10, 220, 30);
        add(displayTextField);

        int buttonWidth = 50;
        int buttonHeight = 50;
        int xPadding = 10;
        int yPadding = 10;
        int row1Y = 50;
        int row2Y = row1Y + buttonHeight + yPadding;
        int row3Y = row2Y + buttonHeight + yPadding;
        int row4Y = row3Y + buttonHeight + yPadding;

        button7.setBounds(xPadding, row1Y, buttonWidth, buttonHeight);
        add(button7);

        button8.setBounds(xPadding + buttonWidth + xPadding, row1Y, buttonWidth, buttonHeight);
        add(button8);

        button9.setBounds(xPadding + (buttonWidth + xPadding) * 2, row1Y, buttonWidth, buttonHeight);
        add(button9);

        buttonDivide.setBounds(xPadding + (buttonWidth + xPadding) * 3, row1Y, buttonWidth, buttonHeight);
        add(buttonDivide);

        button4.setBounds(xPadding, row2Y, buttonWidth, buttonHeight);
        add(button4);

        button5.setBounds(xPadding + buttonWidth + xPadding, row2Y, buttonWidth, buttonHeight);
        add(button5);

        button6.setBounds(xPadding + (buttonWidth + xPadding) * 2, row2Y, buttonWidth, buttonHeight);
        add(button6);

        buttonMultiply.setBounds(xPadding + (buttonWidth + xPadding) * 3, row2Y, buttonWidth, buttonHeight);
        add(buttonMultiply);

        button1.setBounds(xPadding, row3Y, buttonWidth, buttonHeight);
        add(button1);

        button2.setBounds(xPadding + buttonWidth + xPadding, row3Y, buttonWidth, buttonHeight);
        add(button2);

        button3.setBounds(xPadding + (buttonWidth + xPadding) * 2, row3Y, buttonWidth, buttonHeight);
        add(button3);

        buttonSubtract.setBounds(xPadding + (buttonWidth + xPadding) * 3, row3Y, buttonWidth, buttonHeight);
        add(buttonSubtract);

        button0.setBounds(xPadding, row4Y, buttonWidth, buttonHeight);
        add(button0);

        buttonDecimal.setBounds(xPadding + buttonWidth + xPadding, row4Y, buttonWidth, buttonHeight);
        add(buttonDecimal);

        buttonEquals.setBounds(xPadding + (buttonWidth + xPadding) * 2, row4Y, buttonWidth, buttonHeight);
        add(buttonEquals);

        buttonAdd.setBounds(xPadding + (buttonWidth + xPadding) * 3, row4Y, buttonWidth, buttonHeight);
        add(buttonAdd);

        setSize(240, 230);
        setResizable(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }
}
