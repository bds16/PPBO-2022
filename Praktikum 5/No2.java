import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        String s;
        Scanner input = new Scanner(System.in);
        s = input.nextLine();

        int a = -1;
        if (s.matches("^[aiueoAIUEO].*")){
            a = 1;
        } else if (s.matches("^(.*[^ng])(ng)")){
            a = 2;
        }
        
        System.out.print(a);
}
}