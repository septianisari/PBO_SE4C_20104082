package com.septiani.pbo.modul7.latihan;

// Septiani Sari (20104082) //

public class Nama {

    public void Sapa(){
        System.out.println("Tania Bilqis");
    }
    public static void main(String [] args){
        Siapa ss;
        Nama nn;
        ss = new Siapa();
        nn = new Nama();

        ss.Sapa();//memanggil method Sapa() pada class Siapa
        nn.Sapa();//memanggil method Sapa() pada class Nama
    }

}