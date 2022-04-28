package com.belajar;

import java.util.Stack;
import java.util.Scanner;

class ATA {
    // Perintah sort. ini mirip dengan fungsi insertion sort yang bertipe rekursif
    public static void sortedInsert(Stack<Integer> stack, int key)
    {
        /*Jika isi dari stack kosong atau nilai key lebih besar dari seluruh elemen di stack
        the key is greater than all elements in the stack */

        if (stack.isEmpty() || key > stack.peek())
        {
            stack.push(key);
            return;
        }

        // Program dibawah akan dijalankan apabila isi data key lebih kecil dibandingkan elemen teratas pada stack

        // menghapus elemen teratas
        int top = stack.pop();

        // perintah pengulangan untuk element yang tersisa pada stack
        sortedInsert(stack, key);

        // Memasukan elemen yang telah dipop kembali ke dalam stack
        stack.push(top);
    }

    // Method rekursif untuk mensorting stack
    public static void sortStack(Stack<Integer> stack)
    {
        // base case: stack kosong
        if (stack.isEmpty()) {
            return;
        }

        // menghapus elemen teratas pada stack
        int top = stack.pop();

        // mengurutkan data pada stack yang tersisa
        sortStack(stack);

        // memasukan kembali elemen yang telah di pop  ke dalam stack
        sortedInsert(stack, top);
    }

    public static void main(String[] args)
    {
        //Sorting digunakan untuk mengetahui manakah barang yang terlama dan terbaru
        // membuat objek dengan nama class stack
        System.out.println("                **** Aplikasi Transaksi Adil ****");
        System.out.println("");
        System.out.println("10:Kemeja Trasher 23:Sepatu Vans 37:Tas Gothic 41:Skateboard Tony-x");
        System.out.println("52:Celana Cargo 66:Topi Ex-hale 82:Kaos ACDC 94:Sabuk Jews 102:Kalung Unbranded");
        System.out.println("107:Crewneck Putih 121:Air Jordan 133:Casing A7X 134:Gelang UF");
        System.out.println("");
        System.out.println("-----------------------------=====================================-----------------------------");

        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        char ch;
        /**  Menampilkan opsi **/
        do
        {
            System.out.println("\nPilih opsi yang ingin anda lakukan::\n");
            System.out.println("1. Masukan no barang yang anda inginkan");
            System.out.println("2. Keluarkan barang dari keranjang");
            System.out.println("3. Tampilkan daftar barang pada keranjang");
            System.out.println("4. Pengurutan daftar barang"); //Cara Rekursif
            System.out.println("5. Check posisi teratas barang");
            System.out.print("\nDisini = ");

            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.print("Masukan no barang ");
                    stack.push(scan.nextInt());
                    break;
                case 2 :
                    System.out.println("Barang dengan nomor "+ stack.pop()+" telah berhasil dikeluarkan");
                    break;
                case 3 :
                    System.out.println("Daftar no barang:: "+stack);
                    break;
                case 4 :
                    System.out.println("Pengurutan sukses!!!");
                    sortStack(stack);
                    break;
                case 5 :
                    System.out.println("Posisi teratas pada keranjang anda adalah barang dengan no barang "+stack.peek());
                    break;
                default :
                    System.out.println("Error, salah input \n ");
                    break;
            }
            System.out.println("\nAnda ingin melanjutkan proses ini? (Ketik y untuk lanjut atau n untuk batal) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}

