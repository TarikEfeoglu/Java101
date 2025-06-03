import java.util.Scanner;
public class EnBüyükEnKüçük {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kaç adet sayı gireceğinizi giriniz :");

        int sayiAdeti = input.nextInt();
        int kiyaslanilacakBuyukSayi = Integer.MIN_VALUE;
        int kiyaslanilacakKucukSayi = Integer.MAX_VALUE;

        for (int i = 1; i <= sayiAdeti; i++) {
            System.out.print(i + ". sayıyı giriniz :");
            int girilenSayi = input.nextInt();
            System.out.println("Girilen " + i + ". sayı: " + girilenSayi);

            if (girilenSayi > kiyaslanilacakBuyukSayi) {
                kiyaslanilacakBuyukSayi = girilenSayi;
            }

            if (girilenSayi < kiyaslanilacakKucukSayi) {
                kiyaslanilacakKucukSayi = girilenSayi;
            }
        }

        System.out.println("En büyük sayı: " + kiyaslanilacakBuyukSayi);
        System.out.println("En küçük sayı: " + kiyaslanilacakKucukSayi);
    }
}

