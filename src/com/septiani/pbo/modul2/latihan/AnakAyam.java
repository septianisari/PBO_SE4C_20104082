
package com.septiani.pbo.modul2.latihan;

import java.util.Scanner;

// Septiani Sari (20104082) //

public class AnakAyam {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int anak, jumlah;

        System.out.print("Masukan Jumlah Anak Ayam : ");
        anak = scann.nextInt();
        for (jumlah = anak; jumlah > 1; jumlah--){
            System.out.print("Anak Ayam Turun " + anak+ "\n");
            anak=jumlah-1;
            System.out.println("Mati 1 Tinggal " + anak);
        }
        System.out.println("Anak Ayam Turun 1 \nMati 1 Tinggal Induknya");
    }
}