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
public class If {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        int nilai;
        System.out.print("Masukan Nilai Akhir Mata Kuliahnya : ");
        nilai = masukan.nextInt();
        if (nilai < 60) {
            System.out.println("Mahasiswa Tersebut TIDAK LULUS");
        }
        //If Else
        else { 
            System.out.println("Mahasiswa Tersebut Lulus");
        }
    }
    
}
