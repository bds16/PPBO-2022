// Nama : Beatrix Datu Sarira
// NIM  : M0521015

import java.text.DecimalFormat;

public class PPBO_02_Latihan1{
    public static void main(String[] args) {
        int a = 10;
        double b = 3.0;
        float c = 4.3f;

        double A = Double.valueOf(a);
        double C = Double.valueOf(c);
        double abc = A + b + C;

        DecimalFormat df = new DecimalFormat("#.#");
        System.out.printf(df.format(abc));
    }
}

// ubah variabel a dan c ke tipe data double
// jumlahkan variabel a, b, dan c
// tampilkan hasil penjumlahan ketiga variabel

/*
 * Output yang diharapkan:
    17.3
 */