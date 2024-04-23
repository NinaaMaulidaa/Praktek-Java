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
public class SwitchCase {
    public static void main (String args []) {
    Scanner masukan = new Scanner (System.in);
    System.out.print("Masukan Angka 1-3 : ");
    int bil = masukan.nextInt();
    switch (bil) {
        case 1 : System.out.println("Satu");break;
        case 2 : System.out.println("Dua");break;
        case 3 : System.out.println("Tiga");break;
        default : System.out.println("Bilangan Diluar Range"); 
    }
  }
    
}
