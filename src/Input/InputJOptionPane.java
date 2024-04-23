/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;

/**
 *
 * @author thinpad
 */
import javax.swing.JOptionPane;
public class InputJOptionPane {
    public static void main(String[] args) {
        String nama = "";
        String nim = "";
        String jurusan = "";
        String alamat = "";
        String noHp = "";
        nama = JOptionPane.showInputDialog("Silahkan Masukan Nama Anda : ");
        nim = JOptionPane.showInputDialog("Silahkan Masukan Nim Anda : ");
        jurusan = JOptionPane.showInputDialog("Silahkan Masukan Jurusan Anda : ");
        alamat = JOptionPane.showInputDialog("Silahkan Masukan Alamat Anda : ");
        noHp = JOptionPane.showInputDialog("Silahkan Masukan NoTelepon Anda : ");
        
        String msg = "Hello "+nama+ " Nim "+nim+ " Jurusan "+jurusan+ " Alamat "+alamat+ " NoTelepon "+noHp;
        JOptionPane.showMessageDialog(null, msg);
        
        
    }
}
