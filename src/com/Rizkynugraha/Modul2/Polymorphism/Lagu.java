package com.Rizkynugraha.Modul2.Polymorphism;

public class Lagu {
    public String judul;
    public String pencipta;

    // Overloding
    public Lagu(String judul){
        this.judul = judul;
    }

    // Overloading
    public Lagu(String judul, String pencipta){
        this.judul = judul;
        this.pencipta = pencipta;
    }

    public void getDataLagu(){
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Pencipta\t: " + pencipta);
        System.out.println();
    }
}
