import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int rastgeleSayi = rand.nextInt(100);
        System.out.println(rastgeleSayi);
        int tahmin;
        int hak = 5;
        boolean kazandi = false;

        ArrayList<Integer> tahminler = new ArrayList<>();

        System.out.println("=== 0 ile 100 Arasında Tahmin Oyunu ===");
        System.out.println("Toplam 5 tahmin hakkınız var!");
        System.out.println("---------------------------------------");

        while (hak > 0) {
            System.out.print("Tahmininizi girin: ");
            tahmin = input.nextInt();
            tahminler.add(tahmin);
            if (tahmin < 1 || tahmin > 99) {
                System.out.println(" Geçersiz değer! 0 ile 100 arasında bir sayı girin.");
                continue;
            }
            if (tahmin == rastgeleSayi) {
                System.out.println("Tebrikler, doğru tahmin :)))");
                kazandi = true;
                break;
            } else {
                hak--;
                if (hak > 0) {
                    System.out.println(" Yanlış tahmin! Kalan hakkınız: " + hak);
                } else {
                    System.out.println(" Tahmin hakkınız bitti!");
                }
            }
        }

        System.out.println("\n===== Oyun Bitti =====");
        System.out.println("Rastgele sayı: " + rastgeleSayi);
        System.out.println("Yaptığınız tahminler: " + tahminler);

        if (!kazandi) {
            System.out.println("Bir dahaki sefere daha dikkatli ol ");
        }

        input.close();
    }
}
