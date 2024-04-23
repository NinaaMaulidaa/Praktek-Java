/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author thinpad
 */
import java.util.Scanner;
public class AngsuranHutang {
    public static void main (String args []) {
      Scanner masukan = new Scanner(System.in);
      System.out.println("Masukan Jumlah Hutang : ");
      int hutang = masukan.nextInt();
      System.out.println("Lama Angsuran (Bulan) : ");
      int lama = masukan.nextInt();
      System.out.println("Besar Bunga Perbulan (%) : ");
      int bunga = masukan.nextInt();
      
      int n = 0;
      int bayar, total, jumlahbunga;
      
      for (int i = 0; i < lama; i++) {
        jumlahbunga = (hutang - n)/ bunga;
        total = hutang + jumlahbunga;
        bayar = total/lama;
        n += bayar;
        
        System.out.println("Pembayaran ke - " +(i+1)+ " Bayar : " + bayar + " Total Yang Sudah Dibayar : " + n);
        System.out.println();
      }
      System.out.println("Hutang " + hutang + " Dengan Bunga Sebesar "+ bunga + " % LUNAS");
    }  
}
