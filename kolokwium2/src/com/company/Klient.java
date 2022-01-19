package com.company;

import java.time.LocalDate;

public class Klient implements Cloneable,Comparable<Klient>{

    private String nazwa;
    private LocalDate dataZakupy;
    private Double rachunek;


    public Klient(String nazwa,LocalDate dataZakupy,Double rachunek){
        this.nazwa = nazwa;
        this.dataZakupy = dataZakupy;
        this.rachunek = rachunek;

    }

    public String getNazwa(){
        return this.nazwa;

    }

    public LocalDate getDataZakupy(){
        return this.dataZakupy;

    }

    public Double getRachunek(){
        return this.rachunek;
    }

    public String toString(){
        return this.nazwa+ ' ' + this.dataZakupy + ' ' + this.rachunek;

    }


    @Override
    public int compareTo(Klient o) {
        int result = this.dataZakupy.compareTo(o.dataZakupy);
        if(result != 0) {
            return result;
        }

        result = this.nazwa.compareTo(o.nazwa);
        if(result != 0) {
            return result;
        }

        result = this.rachunek.compareTo(o.rachunek);
        return result;
    }


}
