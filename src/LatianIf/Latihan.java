/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatianIf;

//NINA KRISNA MAULIDA
//21110614
//GRUP C1

import java.util.Scanner;
public class Latihan {
    public static void main (String args []) {
    Scanner masukan = new Scanner (System.in);
    
    int i;
    for ( i = 1; i <= 3; ) {
    System.out.println("======DAFTAR MENU======");
    System.out.println("1. Luas dan Keliling Lingkaran");
    System.out.println("2. Luas dan Keliling Persegi Panjang");
    System.out.println("3. Keluar Program");
    System.out.println("________________________");
    
    float panjang, lebar, keliling, luas, phi, r;
        
    System.out.println("Masukan Pilihan : ");
    int nomor = masukan.nextInt();
    System.out.println("________________________");
    
    if(nomor==1){
        System.out.print("Masukan Nilai r : ");
        r = masukan.nextFloat();
        phi = 3.14f;
        luas = phi * r * r;
        keliling = 2 * phi * r;
        System.out.println("Luas Lingkaran : " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }
        
    else if(nomor==2){
        System.out.print("Masukan Nilai Panjang : ");
        panjang = masukan.nextFloat();
        System.out.print("Masukan Nilai Lebar : ");
        lebar = masukan.nextFloat();
        System.out.println("Luas Persegi Panjang : " +(panjang*lebar));
        System.out.println("Keliling Persegi Panjang : " +(2*panjang*lebar));
    }
    else if (nomor==3) {
        break;
    }
    else {
        System.out.println("Nomor Yang Anda Pilih Tidak Ada Di Menu");
        break;
        }
   }
  }  
}
