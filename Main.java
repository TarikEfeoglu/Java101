import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputPrice = new Scanner(System.in);
        System.out.print("Tutar giriniz: ");

        double tutar = inputPrice.nextDouble();
        double kdv = (tutar < 1000) ? 0.18 : 0.08;
        double kdvDeger = kdv * tutar;
        double toplamTutar = tutar + kdvDeger;
        inputPrice.close();

        System.out.println("Tutar: " + tutar);
        System.out.println("KDV oranı: " + kdv);
        System.out.println("KDV değeri: " + kdvDeger);
        System.out.println("Toplam tutar: " + toplamTutar);


    }
}