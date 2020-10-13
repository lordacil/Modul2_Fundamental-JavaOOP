package com.Rizkynugraha.Modul2.Polymorphism;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Summer Rain");
        Lagu lagu2 = new Lagu("Secret Garden", "OH MY GIRL");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
