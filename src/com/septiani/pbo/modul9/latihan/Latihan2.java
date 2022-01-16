package com.septiani.pbo.modul9.latihan;

// Septiani Sari (20104082) //

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Masukan angka : ");
            int angka = scan.nextInt();
            if (angka>10)
                throw new Exception();
            System.out.println("Angka kurang dari atau sama dengan 10");
        }
        catch (Exception s){
            System.out.println("Angka lebih dari 10");
        }
        System.out.println("Selesai");
    }
}