import java.util.Scanner;

public class Faktöriel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, r;
        int combinasyon;

        System.out.print("N değerini giriniz : ");
        n = inp.nextInt();
        int nFaktoriel = 1;
        for (int i = 1; i <= n; i++) {
            nFaktoriel = i * nFaktoriel;
        }
        System.out.println("N sayısının faktorieli : " + nFaktoriel);

        System.out.print("R deçğerini giriniz : ");
        r = inp.nextInt();
        int rFaktoriel = 1;
        for (int i = 1; i <= r; i++) {
            rFaktoriel = i * rFaktoriel;
        }
        System.out.println("R sayısının faktorieli : " + rFaktoriel);

        int faktorielFark =(n-r);
        if (faktorielFark>0){
            int faktorielF = 1;
            for (int i = 1;i<=faktorielFark;i++){
                faktorielF = faktorielF*i;
            }
            System.out.println("(n-r) faktoriyeli : "+faktorielF);

            combinasyon = nFaktoriel/(rFaktoriel*faktorielF);
            System.out.println("Kombinasyon sonucu : "+combinasyon);
        }
        else {
            System.out.println("Yanlış giriş yaptınız tekrar deneyiniz!!!");
        }
    }
}
