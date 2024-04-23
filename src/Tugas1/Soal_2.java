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
public class Soal_2 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float dollar, euro, rupiah;
        System.out.print("Masukan Rupiah : ");
        rupiah = masukan.nextFloat();
        dollar = rupiah / 15259.85f;
        euro = rupiah / 16476.13f;
        System.out.println("Dolar : " + dollar);
        System.out.println("Euro: " + euro);
        
        
    }
    
}
