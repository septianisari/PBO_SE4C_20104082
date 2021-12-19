package com.septiani.pbo.modul9.latihan;

// Septiani Sari (20104082) //

import java.io.FileNotFoundException;

public class Latihan1 {
    public static void method1()
            throws FileNotFoundException{
        throw new FileNotFoundException("File Tidak Ada!");
    }

    public static void main(String[] args) {
        try {
            method1();
        }

        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}