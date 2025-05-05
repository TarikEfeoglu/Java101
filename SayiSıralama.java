import java.util.Scanner;

public class SayiSıralama {
    public static void main(String[] args) {
        int k, sayiAdedi = 0, tamBölünenler = 0, i;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bi sayı giriniz : ");
        k = inp.nextInt();

        for (i = 1; i <= k; i++) {
            if ((i > 0) && (i % 3 == 0) && (i % 4 == 0)) {
                System.out.print(i + " ");
                sayiAdedi++;
                tamBölünenler +=i;
            }
        }
        System.out.println();
        System.out.print("Tam bölünen sayıları ortalaması = " + tamBölünenler/sayiAdedi);
    }
}