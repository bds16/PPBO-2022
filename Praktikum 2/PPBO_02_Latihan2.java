// Nama : Beatrix Datu Sarira
// NIM  : M0521015
public class PPBO_02_Latihan2 {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
        KURS_DOLLAR = 13500;
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}

// Apa yang salah dengan source code tersebut?
// Jawaban : karena pada line 8 terdapat perintah untuk merubah nilai dari variabel KURS_DOLLAR, sedangkan pada line 4 
//           ada deklarasi variabel KURS_DOLLAR sudah didahului oleh keyword final sehingga jika variabel KURS_DOLLAR 
//           diubah akan menyebabkan error.
// Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
// Jawaban : Static merupakan keyword yang menyatakan bahwa variabel tersebut hanya di deklarasikan 1 kali saja dan 
//           method dapat diakses langsung tanpa melalui object, cukup menulis nama class saja.