package com.company;

public class Club extends Pemilik {

    public Club(String nm, String almt) {
       super(nm, almt);
    }

    @Override
    String namaClub(){
        return (super.getNm());
    }

    @Override
    String alamatClub(){
        return(super.getAlmt());
    }
}
