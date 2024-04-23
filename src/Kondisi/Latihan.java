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
//Nina Krisna Maulida
//21110614
import java.util.Scanner;
public class Latihan {
    public static void main (String args []) {
    Scanner masukan = new Scanner (System.in);
    System.out.println("Menu Minuman : ");
    System.out.println("________________________");
    System.out.println("No Nama         Harga");
    System.out.println("1. Cocacola  :  Rp. 6000,00");
    System.out.println("2. Teh Pucuk :  Rp. 5000,00");
    System.out.println("3. Aqua      :  Rp. 4000,00");
    System.out.println("________________________");
    
    int harga = 0;
    int h1 = 6000,h2 = 5000, h3 = 4000;
    String menu;
    for (String i = "Y"; i.equals("Y") || i.equals("y");){
        System.out.println("________________________");
        System.out.println("Masukan Nomor Pesanan : ");
        int nomor = masukan.nextInt();
        System.out.println("________________________");
        if (nomor == 1) {
            menu = "Cocacola";
            System.out.println("Pilihan Anda Nomor " + nomor + menu);
            harga = harga + h1;
        }
        else if (nomor == 2) {
            menu = "Teh Pucuk";
            System.out.println("Pilihan Anda Nomor " + nomor + menu);
            harga = harga + h2;
        }
        else if (nomor == 3) {
            menu = "Aqua";
            System.out.println("Pilihan Anda Nomor " + nomor + menu);
            harga = harga + h3;
        }
        else {
            System.out.println("Nomor Yang anda Pilih Tifdak ada Di Menu");
        }
        System.out.println("Apakah Anda Mau Melanjutkan? Y/T ");
        i = masukan.next();
        System.out.println("________________________");
    }
       System.out.println("Total Pembayaran Sebesar = " + harga + ".");
       System.out.println("Terima Kasih atas Kunjungannya");
    
    }
    
}
