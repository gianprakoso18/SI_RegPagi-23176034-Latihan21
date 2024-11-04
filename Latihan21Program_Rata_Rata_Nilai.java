/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan21.program_rata_rata_nilai;

/**
 *
 * @author gianp
 * NAMA     : Gian Prakoso
 * KELAS    : Sistem Informasi
 * NIM      : 23176034
 */
import java.util.Scanner;
public class Latihan21Program_Rata_Rata_Nilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        int totalNilai = 0;
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            int nilai = scanner.nextInt();
            totalNilai += nilai;
        }

        double rataRata = (double) totalNilai / jumlahMahasiswa;
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);

        System.out.println("Developed by : Rizki Adam Kurniawan");
    }
}
