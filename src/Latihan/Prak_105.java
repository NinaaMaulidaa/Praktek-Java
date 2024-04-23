/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author thinpad
 */
import java.util.Scanner;
public class Prak_105 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int var_a, var_b;
        System.out.print("Masukan Nilai var_a : ");
        var_a = masukan.nextInt();
        System.out.print("Masukan Nilai var_b : ");
        var_b = masukan.nextInt();
        
        System.out.println();
        System.out.println("Variabel Yang Terdapat Dalam Program :");
        System.out.println("var_a = " + var_a);
        System.out.println("var_b = " + var_b);
        
    }
    
}
