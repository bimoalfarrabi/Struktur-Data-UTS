package com.belajar;

import java.util.*;

class Palindrome0 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pemeriksa Palindrom");
        System.out.println("------------------------------");
        System.out.print("Masukan String yang ingin diperiksa: ");
        String str = sc.nextLine();
        String reverse = "";

        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)){
            System.out.println("String '"+str+"' Benar ini adalah palindrom");
        } else {
            System.out.println("String '"+str+"' Bukan Bos!");
        }

    }
}