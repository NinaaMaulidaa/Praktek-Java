/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kondisi;

/**
 *
 * @author thinpad
 */
import java.util.Scanner;
public class If_Majemuk {
    public static void main (String args []) {
    Scanner masukan = new Scanner (System.in);
    System.out.print("Masukan Nilai Matematikanya : ");
    int matematika = masukan.nextInt();
    System.out.print("Masukan Nilai Fisikanya : ");
    int fisika = masukan.nextInt();
    if ((matematika > 75) && (fisika > 70)) {
        System.out.println("Siswa Tersebut DITERIMA");
    }
    else {
        System.out.println("Siswa Tersebut TIDAK DITERIMA");
    }
    
    }
    
}
