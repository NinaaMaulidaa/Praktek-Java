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
public class If_Else {
    public static void main (String args []) {
    Scanner masukan = new Scanner (System.in);
    int nilai;
    System.out.print("Masukan Nilai Akhir Mata Kuliahnya : ");
        nilai = masukan.nextInt();
        if (nilai >= 80) {
            System.out.println("Nilai A");
        }
        else if (nilai >= 70) {
            System.out.println("Nilai B");
        }
        else if (nilai >= 60) {
            System.out.println("Nilai C");
        }
        else if (nilai >= 50) {
            System.out.println("Nilai D");
        }
        else {
            System.out.println("Nilainya E");
        }
    }
    
}
