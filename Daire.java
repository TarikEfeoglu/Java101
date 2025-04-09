import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double r;
        double pi = 3.14;
        double acı ;
        System.out.print("Dairenin yarı çapını girin = ");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        double cevre, alan;
        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.print("Dairenin açısını giriniz = ");
        acı = input.nextInt();
         double daire_dilimi;

         daire_dilimi = (pi*(r*r)*acı)/360;


        System.out.println("Dairenin alanı = " + alan);
        System.out.println("Dairenin çevresi = " + cevre);
        System.out.println("Daire dilimi alanı = " + daire_dilimi);

    }
}
