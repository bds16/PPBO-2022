//Nama  : Beatrix Datu Sarira
//NIM   : M0521015
import java.util.Scanner;

public class PPBO_03_Latihan2 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int year = sc.nextInt();

        if (year % 400 == 0){
            System.out.println(year + " is a leap year");
        }
        else if (year % 100 == 0){
            System.out.println(year + " is not a leap year");
        }
        else if (year % 4 == 0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
        sc.close();
    }
}

// Buatlah conditional statement untuk melakukan pengecekan terhadap input variabel 'year'
// Cek apakah input merupakan tahun kabisat
// Jika tahun kabisat, berikat output '... is a leap year'
// Jika bukan tahun kabisat, berikan output '... is not a leap year'
// ... di atas maksudnya adalah nilai variabel 'year' yang diinputkan

// Contoh 
// input : 2020
// output : 2020 is a leap year
