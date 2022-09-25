// Nama : Beatrix Datu Sarira 
// NIM  : M0521015
public class PPBO_03_Latihan3{
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
    //   for (int i = 1; i < 6; i++) {
    //        System.out.println("elemen ke-" + i + " = " + arr[i]);

    // Setelah Perbaikan
        for (int i = 0; i < 6; i++){
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }

    //   }
    }
}

// Jawab:  adanya kesalahan dalam pengaksesan indeks, indeks array yang diakses sebelum perbaikan di mulai
//         dari indeks ke-1, seharusnya di mulai dari 0.