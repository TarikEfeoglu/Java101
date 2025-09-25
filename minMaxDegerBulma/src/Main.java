import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int girilenSayi = scanner.nextInt();

        int enYakinKucuk = 0;
        int enYakinBuyuk = 0;
        boolean kucukBulundu = false;
        boolean buyukBulundu = false;

        for (int sayi : dizi) {
            if (sayi < girilenSayi) {
                if (!kucukBulundu || sayi > enYakinKucuk) {
                    enYakinKucuk = sayi;
                    kucukBulundu = true;
                }
            }

            if (sayi > girilenSayi) {
                if (!buyukBulundu || sayi < enYakinBuyuk) {
                    enYakinBuyuk = sayi;
                    buyukBulundu = true;
                }
            }
        }

        if (kucukBulundu) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + enYakinKucuk);
        } else {
            System.out.println("Girilen sayıdan küçük bir sayı bulunamadı.");
        }

        if (buyukBulundu) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + enYakinBuyuk);
        } else {
            System.out.println("Girilen sayıdan büyük bir sayı bulunamadı.");
        }


    }
}
