import java.util.Scanner;

public class Hipotenüs {
    public static void main(String[] args) {
int kisa_kenar, uzun_kenar;
double hipotenüs;
        Scanner veri = new Scanner(System.in);
        System.out.print("Kısa kenarı giriniz= ");
        kisa_kenar = veri.nextInt();
        System.out.print("Uzun kenarı giriniz = ");
        uzun_kenar = veri.nextInt();

        hipotenüs = Math.sqrt((kisa_kenar*kisa_kenar)+(uzun_kenar*uzun_kenar));
        System.out.println("Hiptenüs = "+ hipotenüs);

        double cevre, alan;
        cevre = (kisa_kenar+uzun_kenar+hipotenüs)/2;
        alan = Math.sqrt(cevre*(cevre-kisa_kenar)*(cevre-uzun_kenar)*(cevre-hipotenüs));
        System.out.println("Üçgenin alanı ="+ alan);

    }
}