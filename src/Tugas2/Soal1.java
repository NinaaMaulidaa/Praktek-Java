/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author thinpad
 */
import java.io.BufferedReader;
import java.io.InputStreamReader; //baca input
import java.io.IOException; // baca pengecualian
public class Soal1 {
    public static void main (String[] args) {
        BufferedReader datain = new BufferedReader (new InputStreamReader (System.in));
        float alas, tinggi;
        
         try {
            System.out.print("Masukan Alas : ");
            alas = Integer.parseInt(datain.readLine());
            System.out.print("Masukan Tinggi : ");
            tinggi = Integer.parseInt(datain.readLine());
            System.out.println("Luas : " +(0.5*alas*tinggi));    
         }
         catch (IOException e) {
            System.out.println("Eror");
         }
    }
}
