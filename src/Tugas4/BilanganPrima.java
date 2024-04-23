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
public class BilanganPrima {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int bil, awal, akhir;
        
         System.out.print("Mulai dari : ");
         awal=input.nextInt();
         System.out.print("Sampai : ");
         akhir=input.nextInt();
         System.out.println("----------------------------------------------");
        for (int i=awal; i<=akhir; i++){
            bil=0;
            for (int n=1;n<=i;n++){
                if (i%n==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }             
        }    
   }
}
