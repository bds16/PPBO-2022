import java.util.Scanner
;
public class Mahasiswa {

    public static void main(String[] args){

        String nim, nama, jenisKelamin, alamat;

        Scanner inUser = new Scanner(System.in);
        
        System.out.print("Nama                : ");
        nama = inUser.nextLine();
        System.out.print("NIM                 : ");
        nim = inUser.nextLine();
        System.out.print("Jenis Kelamin       : ");
        jenisKelamin = inUser.nextLine();
        System.out.print("Alamat              : ");
        alamat = inUser.nextLine();

        System.out.println();
        System.out.println("----------DATA MAHASISWA----------");
        System.out.println("Nama                 : " + nama);
        System.out.println("NIM                  : " + nim);
        System.out.println("Jenis Kelamin        : " + jenisKelamin);
        System.out.println("Alamat               : " + alamat);



    }
}
