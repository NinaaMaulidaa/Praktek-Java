package Uts;

//Nina Krisna Maulida
//21110614

import java.util.Scanner;
public class ProgramBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah buku yang akan dicatat: ");
        int jumlah = input.nextInt();
        
        String[] judul = new String[jumlah];
        int[] stok = new int[jumlah];
        int[] tahun = new int[jumlah];
        
        for (int i = 0; i< jumlah; i++) {
            System.out.print("Masukan judul buku Ke-" + (i+1) + ": ");
            judul[i] = input.next();
            System.out.print("Masukan stok buku Ke-" + (i+1) + ": ");
            stok[i] = input.nextInt();
            System.out.print("Masukan tahun terbit buku Ke-" + (i+1) + ": ");
            tahun[i] = input.nextInt();
        }
        
        System.out.printf("\n| %-20s | %-10s | %-10s |\n", "Judul", "Stok", "Tahun");
        for(int i = 0; i < jumlah; i++) {
            System.out.printf("\n| %-20s | %-10s | %-10s |\n", judul[i], stok[i],tahun[i]);
        }
    }
}