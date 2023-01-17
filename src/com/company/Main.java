package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Club clb = new Club("ASKUMPALA FC KAWEDANAN", "MAGETAN");
        SSB ssb = new SSB();
        System.out.println("============ IDENTITAS CLUB ============");
        System.out.println("Nama Club : "+clb.getNm());
        System.out.println("Alamat Club : "+clb.getAlmt());
        System.out.println("========================================");
        ssb.menu();
    }
}
