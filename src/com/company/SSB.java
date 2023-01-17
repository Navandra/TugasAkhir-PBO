package com.company;

import java.util.Scanner;

public class SSB implements Auth {
    private int pilih;

    String[] nama = new String[3];
    String[] alamat = new String[3];
    int[] status = new int[3];

    Scanner in = new Scanner(System.in);

    public void menu() {
        do {
            System.out.println("\n1. Registrasi Anggota");
            System.out.println("2. Pembayaran Anggota");
            System.out.println("3. Riwayat Pembayaran");
            System.out.println("4. Daftar Anggota");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan : ");
            pilih = in.nextInt();

            switch (pilih){
                case 1:
                    registrasi();
                    break;
                case 2:
                    pembayaran();
                    break;
                case 3:
                    riwayat();
                    break;
                case 4:
                    daftar();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while ( pilih != 5);
    }

    public void registrasi() {
        Scanner nm = new Scanner(System.in);
        Scanner al = new Scanner(System.in);

        for (int k=1; k<nama.length; k++){
            if (nama[k] == null) {
                for (int i=k; i<k+1; i++){
                    System.out.print("Nama : ");
                    nama[k] = nm.nextLine();
                    System.out.print("Alamat : ");
                    alamat[k] = al.nextLine();
                }
                break;
            }
        }
    }

    public void pembayaran() {
        System.out.println("\n=== PEMBAYARAN ANGGOTA ===");
        System.out.println("-------------------------");
        System.out.println("|\tNAMA\t|\tALAMAT\t|");
        System.out.println("-------------------------");
        for (int j=1; j<nama.length; j++) {
            if (nama[j] != null) {
                System.out.println(j + ". " + nama[j] + "\t\t|\t" + alamat[j] + "\t|");
            }
        }
        System.out.println("-------------------------");

        Scanner pb = new Scanner(System.in);
        System.out.print("Masukkan nomor anggota : ");
        int no = pb.nextInt();

        for (int i=1; i<nama.length; i++) {
            if (nama[i] != null && nama[no] != null) {
                System.out.print("\nProses pembayaran atas nama "+nama[no]+"? [Y/N] : ");
                String pb2 = in.next();

                if (pb2.equals("y") || pb2.equals("Y")) {
                    status[no] = 1;
                    System.out.println("SELAMAT PEMBAYARAN BERHASIL DIPROSES!!");
                } else {
                    menu();
                }
                break;
            } else if (no > nama.length) {
                System.out.println("Anggota tidak ada!");
                menu();
            } else {
                System.out.println("Anggota tidak ada!");
                menu();
            }
        }
    }

    public void riwayat() {
        System.out.println("\n============== RIWAYAT PEMBAYARAN ===============");
        System.out.println("-------------------------------------------------");
        System.out.println("|\tNAMA\t|\tALAMAT\t|\tSTATUS PEMBAYARAN\t|");
        System.out.println("-------------------------------------------------");
        for (int j=1; j<nama.length; j++) {
            if (nama[j] != null) {
                System.out.println(j + ". " + nama[j] + "\t|\t" + alamat[j] + "\t|" + ((status[j] == 0) ? "\tBELUM BAYAR" : "\t\tLUNAS"));
            }
        }
        System.out.println("-------------------------------------------------");
    }

    public void daftar() {
        System.out.println("\n===  DAFTAR ANGGOTA  ===");
        System.out.println("-------------------------");
        System.out.println("|\tNAMA\t|\tALAMAT\t|");
        System.out.println("-------------------------");
        for (int j=1; j<nama.length; j++) {
            if (nama[j] != null) {
                System.out.println(j + ". " + nama[j] + "\t\t|\t" + alamat[j] + "\t|");
            }
        }
        System.out.println("-------------------------");
    }
}
