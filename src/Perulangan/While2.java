/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

/**
 *
 * @author thinpad
 */
import java.util.Scanner;
public class While2 {
    public static void main (String args []) {
       Scanner masukan = new Scanner(System.in);
       int n = 0, total = 0, bil = 9;
       while (bil != 0) {
           n++;
           System.out.println("Masukkan Bilangan ke - "+n+" : ");
           bil = masukan.nextInt();
           total += bil;
       }
       System.out.print("Total Jumlah "+(n-1)+" Bilangan Tersebut : ");
       System.out.println(total);
    }
    
}
