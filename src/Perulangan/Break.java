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
public class Break {
    public static void main (String args []) {
      Scanner masukan = new Scanner(System.in);
      System.out.println("Masukan Sebuah Bilangan : ");
      int bil = masukan.nextInt();
     boolean prima = true;
     for (int i = 2; i<bil; i++) {
         if ((bil % i) == 0) {
             prima = false;
             break;
         }
     }
     if (prima)
         System.out.print (bil + " Adalah Bilangan PRIMA ");
     else
         System.out.print (bil + " Adalah Bukan Bilangan PRIMA ");
    }
    
}
