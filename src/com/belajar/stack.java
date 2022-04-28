package com.belajar;

import java.util.Scanner;

class stack {
    public static void main(String[] agrs) {
        System.out.println("**** Aplikasi Penawaran Barang Gratis  ****");
        System.out.println("");
        System.out.println("1:Kemeja Trasher 2:Sepatu Vans 3:Tas Gothic 4:Skateboard Tony-x");
        System.out.println("5:Celana Cargo 6:Topi Ex-hale 8:Kaos ACDC 9:Sabuk Jews 10:Kalung Unbranded");
        System.out.println("");
        System.out.println("-----------------===============================-------------------");
        System.out.println("");
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        int o;
        int noBarang;
        MyStack s = new MyStack();
        while (flag) {
            System.out.println(" 1. Masukan Kode Barang 2. Check Keranjang  3. Kembalikan Barang 4. Daftar Barang 5. Selesai: ");
            o = in.nextInt();
            switch (o) {
                case 1:
                    System.out.println(" Masukan no barang: ");
                    noBarang = in.nextInt();
                    s.push(noBarang);
                    break;

                case 2:
                    s.peek();
                    break;

                case 3:
                    s.pop();
                    break;

                case 4:
                    s.disp();
                    break;

                case 5:
                    flag = false;
                    break;
            }
        }
    }
}
