package com.septiani.pbo.modul7.percobaan;

// Septiani Sari (20104082) //

public class TV  extends Electronics{
    public TV() {
    }

    public TV(String name) {
        super(name);
    }

    public void onActivate(){
        System.out.println(this.getName() + " starts displaying image!");
    }

    public void onDeactivate(){
        System.out.println(this.getName() + " stops displaying image!");
    }
}
