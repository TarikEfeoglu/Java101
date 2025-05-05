import java.util.Scanner;

public class CiftSayilar {
    public static void main(String[] args) {
        int i, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz : ");
            i = input.nextInt();

            if ((i % 2 == 0) && (i % 4 == 0) && (i > 0)) {
                total += i;
            }

        } while (i > 0);
        System.out.println("Toplam = " + total);
    }

}