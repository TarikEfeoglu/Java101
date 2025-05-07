import java.util.Scanner;

public class ÜslüSayiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, a;
        System.out.print("Lütfen üssü alınacak sayıyı giriniz : ");
        n = inp.nextInt();

        System.out.print("Lütfen sayının katını giriniz : ");
        a = inp.nextInt();

        int toplam = 1;
        for (int i = 1; i <= a; i++) {
            toplam *= n;
        }
        System.out.println("Cevap = " + toplam);
    }
}