import java.util.Scanner;

public class No1 {
    public static void main(String args [] ) throws Exception {
        String s;
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        input.close();

        for (int a = 0; a < s.length();a++){
            if (a%3 == 0){
                System.out.print(s.charAt(a));
            }
        }
    }
}
