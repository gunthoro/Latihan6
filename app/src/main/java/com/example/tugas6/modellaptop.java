package com.example.tugas6;

public class modellaptop {
    private String namalaptop;
    private String descLaptop;
    private Double hargaLaptop;
    private int gambarlaptop;

    public modellaptop(String namalaptop,int gambarlaptop, String descLaptop, Double hargaLaptop){
        this.namalaptop = namalaptop;
        this.gambarlaptop = gambarlaptop;
        this.descLaptop = descLaptop;
        this.hargaLaptop = hargaLaptop;
    }

    public String getNamalaptop() {
        return namalaptop;
    }

    public void setNamalaptop(String namalaptop) {
        this.namalaptop = namalaptop;
    }

    public int getGambarlaptop() {
        return gambarlaptop;
    }

    public void setGambarlaptop(int gambarlaptop) {
        this.gambarlaptop = gambarlaptop;
    }

    public String getdescLaptop() {
        return descLaptop;
    }

    public void setdescLaptop(String descLaptop) {
        this.descLaptop = descLaptop;
    }

    public Double gethargaLaptop() {
        return hargaLaptop;
    }

    public void sethargaLaptop(Double hargaLaptop) {
        this.hargaLaptop = hargaLaptop;
    }

}


