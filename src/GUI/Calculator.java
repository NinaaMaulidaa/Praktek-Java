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
public class Calculator extends javax.swing.JFrame {

    private JTextField displayTextField;
    private JButton button7, button8, button9, buttonDivide,
            button4, button5, button6, buttonMultiply,
            button1, button2, button3, buttonSubtract,
            button0, buttonDecimal, buttonEquals, buttonAdd;

    public Calculator() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        displayTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // Ukuran font dan gaya teks
        displayTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT); // Teks rata kanan
        displayTextField.setEditable(false); // Teks tidak dapat diedit

        // Mengatur layout frame menggunakan GridBagLayout
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH; // Mengisi seluruh ruang yang tersedia

        // Menambahkan komponen displayTextField ke frame
        gbc.gridx = 0; // Kolom 0
        gbc.gridy = 0; // Baris 0
        gbc.gridwidth = 4; // Mengambil 4 kolom
        gbc.weightx = 1.0; // Mengisi ruang secara horizontal
        gbc.weighty = 0.2; // Mengisi ruang secara vertikal
        getContentPane().add(displayTextField, gbc);

        // Menambahkan komponen-komponen tombol ke frame
        gbc.gridy = 1; // Baris 1
        gbc.gridwidth = 1; // Mengambil 1 kolom
        gbc.weightx = 0.25; // Mengisi ruang secara horizontal (1/4 dari frame)
        gbc.weighty = 0.2; // Mengisi ruang secara vertikal

        // Baris 1
        gbc.gridx = 0;
        getContentPane().add(button7, gbc);

        gbc.gridx = 1;
        getContentPane().add(button8, gbc);

        gbc.gridx = 2;
        getContentPane().add(button9, gbc);

        gbc.gridx = 3;
        getContentPane().add(buttonDivide, gbc);

        // Baris 2
        gbc.gridy = 2;
        gbc.gridx = 0;
        getContentPane().add(button4, gbc);

        gbc.gridx = 1;
        getContentPane().add(button5, gbc);

        gbc.gridx = 2;
        getContentPane().add(button6, gbc);

        gbc.gridx = 3;
        getContentPane().add(buttonMultiply, gbc);

        // Baris 3
        gbc.gridy = 3;
        gbc.gridx = 0;
        getContentPane().add(button1, gbc);

        gbc.gridx = 1;
        getContentPane().add(button2, gbc);

        gbc.gridx = 2;
        getContentPane().add(button3, gbc);

        gbc.gridx = 3;
        getContentPane().add(buttonSubtract, gbc);

        // Baris 4
        gbc.gridy = 4;
        gbc.gridx = 0;
        getContentPane().add(button0, gbc);

        gbc.gridx = 1;
        getContentPane().add(buttonDecimal, gbc);

        gbc.gridx = 2;
        getContentPane().add(buttonEquals, gbc);

        gbc.gridx = 3;
        getContentPane().add(buttonAdd, gbc);

        pack(); // Mengatur ukuran frame sesuai dengan komponen yang ada
    }

    public static void main(String[] args) {
        // Menjalankan aplikasi GUI di event dispatch thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
}
