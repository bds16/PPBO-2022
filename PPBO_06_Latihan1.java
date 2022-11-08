//Nama : Beatrix Datu Sarira
//NIM  : M0521015

public class PPBO_06_Latihan1 {
    static class Mahasiswa{
        // lengkapi kode ini
        public String nim;
        public static int angka_nim = -1;
        public Mahasiswa(){
            angka_nim++;
            nim = String.format("%04d", angka_nim); 
        }
    }
    
    static class Kelas{
        // lengkapi kode ini
        public static  char namaKelas = ('A'-0b1);
        private int jumlah = 0;
        public static Mahasiswa [] mahasiswaArr = new Mahasiswa[5];
        Kelas(){
            namaKelas++;
            for(; jumlah<5; jumlah++){
                mahasiswaArr[jumlah] = new Mahasiswa();
            }
        }
    }
    public static void main(String[] args) {
        Kelas[] kelas = new Kelas[5];
        
        for (int i = 0; i < kelas.length; i++){
            kelas[i] = new Kelas();
    
            System.out.println("Kelas " + kelas[i].namaKelas);
            
            for (int j = 0; j < kelas[i].mahasiswaArr.length; j++){
                System.out.print(" " + kelas[i].mahasiswaArr[j].nim);
                
            }
    
            System.out.println();
        }
    }
}
