import java.util.Scanner;

public class UsAlma {

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Tabab sayısnı giriniz : ");
        int a = inp.nextInt();

        System.out.print("Kat sayısını giriniz : ");
        int b = inp.nextInt();

        power(a, b);
        System.out.print("Sonuç = " + power(a, b));

    }
}