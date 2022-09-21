// Nama : Beatrix Datu Sarira
// NIM  : M0521015
import java.util.Scanner;

public class PPBO_03_Latihan1 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Pembelian: ");

        double totalPembelian = sc.nextDouble();
        double bayar = 0;

        if (totalPembelian > 125000){
            bayar = totalPembelian*0.8;
        }
        else if (totalPembelian > 75000){
            bayar = totalPembelian*0.85;
        }
        else if (totalPembelian > 50000){
            bayar = totalPembelian*0.95;
        }
        System.out.println("Total Pembayaran Anda: "+bayar);
        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000