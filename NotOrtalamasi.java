import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, muz;

        Scanner input = new Scanner(System.in);


        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fiz = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kim = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        tur = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muz = input.nextInt();

        double toplam = (mat + fiz + kim + tur + muz);
        int toplamDersSayısı = 5;

        if (mat < 0 || mat > 100) {
            toplam = toplam - mat;
            toplamDersSayısı--;
        }

        if (fiz < 0 || fiz > 100) {
            toplam = toplam - fiz;
            toplamDersSayısı--;

        }

        if (kim < 0 || kim > 100) {
            toplam = toplam - kim;
            toplamDersSayısı--;

        }

        if (tur < 0 || tur > 100) {
            toplam = toplam - tur;
            toplamDersSayısı--;

        }

        if (muz < 0 || muz > 100) {
            toplam = toplam - muz;
            toplamDersSayısı--;

        }

        double average = toplam / toplamDersSayısı;
        if (average > 55) {
            System.out.println("Geçtiniz tebrikler!");
        } else {
            System.out.println("Kaldınız tekrar deneyiniz!");
        }
        System.out.print("Not ortalama : " + average);
    }
}