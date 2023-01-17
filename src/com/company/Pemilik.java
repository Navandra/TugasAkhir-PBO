package com.company;

abstract public class Pemilik {
    private String nm,almt;

    public Pemilik(String nm, String almt) {
        this.nm = nm;
        this.almt = almt;
    }

    public String getNm() {
        return nm;
    }

    public String getAlmt() {
        return almt;
    }

    abstract String namaClub();
    abstract String alamatClub();
}
