/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author thinpad
 */
import java.util.Scanner;
public class Soal_1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float jari_jari, phi, luas, keliling;
        System.out.print("Masukan Jari-Jari : ");
        jari_jari = masukan.nextFloat();
        phi = 3.14f;
        luas = phi * jari_jari * jari_jari;
        keliling = 2 * phi * jari_jari;
        System.out.println("Luas : " + luas);
        System.out.println("Keliling: " + keliling);
    }
        
    
}
