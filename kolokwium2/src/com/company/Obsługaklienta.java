package com.company;

import java.util.ArrayList;


public class Obsługaklienta {

    public static Double procentRabatu;
    private ArrayList<Klient> klient;


    public Obsługaklienta(ArrayList<Klient> klient){
        this.klient = klient;

    }


    public static void set(){

        procentRabatu = 0.05;

    }

}
