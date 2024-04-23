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
public class Prak_106 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float celcius, reamur;
        System.out.print("Masukan Nilai Suhu (celcius) : ");
        celcius = masukan.nextFloat();
        reamur = 0.8f * celcius;
        System.out.print("Nilai Suhu (Reamur)dari Input : ");
        System.out.println(reamur);
    
        }
}
