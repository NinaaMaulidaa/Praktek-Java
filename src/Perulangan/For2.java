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
public class For2 {
    public static void main (String args[]) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Masukan Batas Bilangan : ");
        int batas = masukan.nextInt();
        System.out.println("Bilangan Genap Dari 2 Sampai Bilangan Tersebut : ");
        for(int i = 2; i <=batas; i = i + 2)
        System.out.print(i + " ");
    }
    
}
