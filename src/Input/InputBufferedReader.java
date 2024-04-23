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
import java.io.BufferedReader;
import java.io.InputStreamReader; //baca input
import java.io.IOException; // baca pengecualian
public class InputBufferedReader {
    public static void main(String[] args) {
        BufferedReader datain = new BufferedReader (new InputStreamReader (System.in));
        String nama = "";
        String nim = "";
        System.out.println("Silahkan Masukan Nama Anda : ");
        
        try{
            nama = datain.readLine();
            System.out.println("Silahkan Masukan Nim Anda :");
            nim = datain.readLine();    
        }
        catch (IOException e) {
            System.out.println("Eror");
        }
        System.out.println("Nama Saya : " + nama);
        System.out.println("Nim Saya : " + nim);
    }
}
