import java.util.Scanner;

public class Kitleİndeks {
    public static void main(String[] args) {
        double boy,kilo, kitle;
        Scanner inp = new Scanner(System.in);
        System.out.print("Boyunuzu metre olarak giriniz = ");

        boy = inp.nextDouble();

        System.out.print("Kilonuzu kilogram olarak giriniz = ");
        kilo = inp.nextInt();

        kitle = (kilo/boy)*boy;
        System.out.print("Vücut kitle indeksiniz = "+kitle);
    }
}