package com.belajar;

import java.util.*;

class MyStack {
    private int top=-1;
    private int stk[] = new int[4];
    boolean empty()
    {
        if(top >= 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    int peek()
    {
        if(empty())
        {
            System.out.println("Tidak ada barang pada keranjang anda");
            return 0;
        }
        else
        {
            System.out.println("Posisi teratas dari barang anda adalah barang dengan noBarang: "+stk[top]);
            return stk[top];
        }
    }
    void push(int num)
    {
        if(top == 5)
        {
            System.out.println("n Stack is in overflow state");
        }
        else
        {
            stk[++top] = num;
            System.out.println("  Sukses!! no barang "+num+" sudah dimasukan ke Keranjang");
        }
    }

    int pop()
    {
        if(top < 0)
        {
            System.out.println("Error!! Keranjang anda sudah kosong");
            return 0;
        }
        else
        {
            int x = stk[top--];
            System.out.println("  Berhasil!! no barang "+x+" sudah dikeluarkan dari keranjang");
            return x;
        }
    }
    void disp()
    {
        if(empty())
        {
            System.out.println("Keranjang Anda kosong");
        }
        else
        {
            System.out.println("  Daftar Barang Anda: ");
            for(int i=0; i<=top; i++)
            {
                System.out.print(" | "+stk[i] + " | ");
            }


        }
    }
}