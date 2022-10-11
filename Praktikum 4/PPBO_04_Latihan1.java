// Nama : Beatrix Datu Sarira
// NIM  : M0521015

import java.util.Scanner;
public class PPBO_04_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ketik bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Ketik bilangan kedua : ");
        int bil2 = sc.nextInt();
        double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        sc.close();
    }
}

/* a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
 - Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
    --> TIDAK
 - Tulis output yang muncul!
    --> Exception in thread "main" java.util.InputMismatchException      
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)   
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at PPBO_04_Latihan1.main(PPBO_04_Latihan1.java:6)
 - Jelaskan maksud dari output tersebut! 
    --> Terjadi exception pada program. Jenis Exceptionnya adalah InputMismatchException yang 
        terjadi ketika input yang dimasukan tidak sesuai dengan tipe data yang diminta.
 */

/* b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input bilangan kedua. 
    Jelaskan output yang muncul!
 - Tulis output yang muncul!
    --> 16 / 0 = Infinity
 - Jelaskan maksud dari output tersebut! 
    --> Output dari hasil pembagian 16 dibagi 0 adalah infinity, karena variabel "hasil" bertipe data double
        sehingga dimungkinkan pembagian oleh 0.
    */
