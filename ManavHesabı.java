import java.util.Scanner;

public class ManavHesabı {
    public static void main(String[] args) {
        double toplam, kArmut = 2.14, kElma = 3.67, kDOmates = 1.11, kMuz = 0.95, kPatlican = 5;
        double armut, elma, domates, muz, patlican;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo = ");
        armut = input.nextDouble();

        System.out.print("Elma kaç kilo = ");
        elma = input.nextDouble();

        System.out.print("Domates kaç kilo = ");
        domates = input.nextDouble();

        System.out.print("Muz kaç kilo = ");
        muz = input.nextDouble();

        System.out.print("Patlican kaç kilo = ");
        patlican = input.nextDouble();
        toplam = (armut * kArmut) + (elma * kElma) + (domates * kDOmates) + (muz * kMuz) + (patlican * kPatlican);
        System.out.print("Toplam  = " + toplam);

    }
}