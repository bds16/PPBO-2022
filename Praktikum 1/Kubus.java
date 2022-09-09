public class Kubus {
    int sisiKubus = 5;

    public Double hitungVolume() {
        Double volume = Double.valueOf(this.sisiKubus )* Double.valueOf(this.sisiKubus) * Double.valueOf(this.sisiKubus);
        return volume;
    }

    public int hitunngLuasPermukaan() {
        int luasPermukaan = 6*(this.sisiKubus*this.sisiKubus);
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        System.out.println("Sisi Kubus : " +kubus.sisiKubus);
        System.out.println("Voluem Kubus : " +kubus.hitungVolume());
        System.out.println("Luas Permukaan : " +kubus.hitunngLuasPermukaan());
    }
}
