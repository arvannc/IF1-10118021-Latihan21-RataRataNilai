/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118021.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author Arvan
 * NAMA     : M Arvan Nurcahyana
 * KELAS    : IF-1
 * NIM      : 10118021
 * Deskripsi Program : Rata-rata Nilai
 */
public class IF110118021Lathan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya Mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();
        double ratanilai = 0;
        for(int i = 0; i < jumlahMahasiswa; i++){
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
            ratanilai += input.nextInt();
        }
        ratanilai /= jumlahMahasiswa;
        System.out.println("Maka, Rata-rata Nilainya adalah " + ratanilai);
        System.out.println("(Developed by : M. Arvan Nurcahyana)");
    }
    
}
