//Nama  : Beatrix Datu Sarira
//NIM   : M0521015

package com.java.p8a;

import com.java.p8.Buku;

public class ClassX {
    public static void name(String[] args) {
         Buku buku = new Buku("432A326B4", "Pengenalan Komputasi Cloud", "Eri Suhardi", "Elex Media Komputindo", 2022);

         buku.printDataBuku();

         System.out.println(buku.isbn);
         System.out.println(buku.judul);
         System.out.println(buku.penulis);
         System.out.println(buku.penerbit);
         System.out.println(buku.tahunTerbit);
    }
}

/*
Adakah error yang ditemui pada ClassX yang berkaitan dengan access modifier? Jelaskan penyebab
errornya!
Jawaban :
Terdapat error pada class Buku karena class Buku tidak ada di package ini, sementara class Buku yang dimaksud 
mungkin berada pada package yang lain(yaitu com.java.p8) sementara file ini berada di package (com.java.p8a). 
 */