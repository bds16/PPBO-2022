// Nama : Beatrix Datu Sarira 
// NIM  : M0521015
public class PPBO_03_Latihan5 {
    public static void main(String[] args) {
        int i = 3;
        while (true) {
            System.out.println("Hello ke-" + i);
            if (i == 300) break;
            i += 3;
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
    }
}
