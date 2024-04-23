/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;

/**
 *
 * @author thinpad
 */
import java.util.Scanner;
public class InputScanner {
    public static void main(String[] args){
        Scanner datain = new Scanner (System.in);
        System.out.println("Silahkan Masukan Nama : ");
        String nama = "";
        nama = datain.nextLine();
        System.out.println("Nama Saya : " +nama);
    }
    
}
