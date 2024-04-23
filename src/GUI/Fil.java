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
import java.awt.event.*;

public class Fil extends JFrame {
    JTextArea nama = new JTextArea(10,10);
    JButton bt = new JButton("Copy");
    JTextArea txnama = new JTextArea(10,10);
    
    Fil() {
        super ("INI ADALAH FORM");
        setLocation(200,300);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    void tampilan() {
        getContentPane().add(nama);
        nama.append("Nama Kamu Siapa");
        getContentPane().add(bt);
        getContentPane().add(txnama);
        txnama.setBackground(Color.LIGHT_GRAY);
        bt.addActionListener (new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            txnama.append(nama.getSelectedText());
            }
    } );
        getContentPane().setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String args[]) {
        Fil f = new Fil();
        f.tampilan();
    }
}