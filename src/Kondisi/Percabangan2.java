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
public class Percabangan2 {
    public static void main (String [] args) {
        char kode = 'B';
        if(kode == 'A') {
            System.out.println("Meja = 10");
        }
        else if (kode == 'B') {
            System.out.println("Kursi = 25");
        }
        else if (kode == 'C') {
            System.out.println("Laptop = 5");
        }
        else{
            System.out.println("Bukan Ketiganya");
        }
    }
}
