package com.Rizkynugraha.Modul2.Polymorphism;

public class DemoOverriding {
    public static void main(String[] args) {
        X superclass = new X();
        Y subclass = new Y();

        superclass.getValue("Jung Eunbi");
        subclass.getValue("Jung Ye-Rin");
    }
}
