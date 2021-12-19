package com.septiani.pbo.modul9.percobaan;

// Septiani Sari (20104082) //

public class Percobaan4 {
    public static void main(String[] args)
    { int bil = 10 ; try{
        System.out.println(bil/0);
    }catch(ArithmeticException e){
        System.out.println("Terjadi exception karena tidak boleh membagi bilangan dengan 0");
    }catch(Exception e){
        System.out.println("Terdapat Error");
    }
    }
}
