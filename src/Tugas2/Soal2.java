/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author thinpad
 */
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int bil;
        
        System.out.print("Masukan Bilangan = ");
        bil=input.nextInt();
        
        if (bil%2==0){
            System.out.println("Bilangan "+bil+" adalah bilangan GENAP");
        }
        else {
             System.out.println("Bilangan "+bil+" adalah bilangan GANJIL");
        }
    
  }  
}
