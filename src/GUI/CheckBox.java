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
public class CheckBox extends JFrame {
    Checkbox unta = new Checkbox("Nama Kamu Siapa");
    Checkbox kuda = new Checkbox("Nama Kamu Anton");
    Checkbox kuda2 = new Checkbox("Nama Kamu Wong");
    CheckboxGroup checkboxgroup = new CheckboxGroup();
    CheckBox(){
        super("PROGRAM MENGHITUNG ZAKAT");
        setLocation(200, 100);
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek() {
        getContentPane().setLayout(null);
        getContentPane().add(unta);
        getContentPane().add(kuda);
        getContentPane().add(kuda2);
        unta.setBounds(30,90,150,20);
        kuda.setBounds(30,120,150,20);
        kuda2.setBounds(30,150,150,20);
        setVisible(true);
    }
    public static void main(String args[]) {
        CheckBox ZZ=new CheckBox();
        ZZ.objek();
    }
}
