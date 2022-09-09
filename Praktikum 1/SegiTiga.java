public class SegiTiga {
    int alas = 3, tinggi = 4, sisiMiring = 5;

    public Double hitungLuas(){
        Double luas = 0.5 * this.alas * this.tinggi;
        return luas;
    }

    public Double hitungKeliling(){
        Double keliling = Double.valueOf(this.alas)+Double.valueOf(this.tinggi)+ Double.valueOf(this.sisiMiring);
        return keliling;
    }

public static void main (String[] args){
    SegiTiga segiTiga = new SegiTiga();
    System.out.println("Alas : " +segiTiga.alas);
    System.out.println("Tinggi : " +segiTiga.tinggi);
    System.out.println("Sisi Miring : " +segiTiga.sisiMiring);
    System.out.println("Luas Segitiga : " +segiTiga.hitungLuas());
    System.out.println("Keliling Segitiga : " +segiTiga.hitungKeliling());
}
}
