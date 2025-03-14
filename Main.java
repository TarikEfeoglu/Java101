import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String g = "Geçtin", k ="Kaldın";
        int mat, tur, fzk, kmy, trh, muz;
        Scanner not = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = not.nextInt();
        System.out.print("Türkçe notunuz: ");
        tur = not.nextInt();
        System.out.print("Fizik notunuz: ");
        fzk = not.nextInt();
        System.out.print("Kimya notunuz: ");
        kmy = not.nextInt();
        System.out.print("Tarih notunuz: ");
        trh = not.nextInt();
        System.out.print("Müzik notunuz: ");
        muz = not.nextInt();
        int toplam = (mat + tur + fzk + kmy + trh + muz);
        double ortalama = toplam / 6;
        System.out.println("Ortalaman = " + ortalama);
        System.out.println(ortalama>=60?g:k);

    }

}