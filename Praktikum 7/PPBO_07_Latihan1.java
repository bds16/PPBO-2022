//Nama  : Beatrix Datu Sarira
//NIM   : M0521015

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PPBO_07_Latihan1 {
    // method ini untuk input teks oleh user melalui keyboard
    public String ketikTeks() {
		System.out.println("Ketik kalimat yang akan disimpan :");
		Scanner sc = new Scanner(System.in);
		// ambil 1 kalimat, setelah tekan enter teks akan diambil
		String str1 = sc.nextLine();
        sc.close();
		return str1;
	}

	// untuk menyimpan teks yang diketik user ke file
	public void simpanTeks(String teks) {
		// set up file and stream
		// ganti path "/tmp/sample3.data" dengan alamat file di komputer anda
		File outFile = new File("sample3.data");
        try {
            outFile.createNewFile();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
		FileOutputStream outFileStream;
		try {
			outFileStream = new FileOutputStream(outFile);
			PrintWriter outStream = new PrintWriter(outFileStream);
			outStream.print(teks);
			outStream.close();
			System.out.println("file berhasil disimpan");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
    public static void main(String[] args) {
        PPBO_07_Latihan1 it = new PPBO_07_Latihan1();
		// memanggil method ketikTeks
		String kalimat = it.ketikTeks();
		// memanggil method simpanTeks
		it.simpanTeks(kalimat);
    }
}

/*
 * Jalankan source code tersebut, buka file teks menggunakan text editor, jelaskan seperti apa hasilnya.
 * ==>
 * Saat dijalankan, akan meminta memasukan teks pada terminal. Setelah
 * selesai menginputkan teks tersebut akan disimpan pada file sample3.data
 * Saat dibuka sample3.data isinya sama dengan apa yang kita masukan pada terminal
 */