import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 Sayısınız giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 Sayısnı giriniz : ");
        int n2 = input.nextInt();
        int i = 1;
        int ebob = 1;
        int ekok = 1;

        while ((i <= n1) && (i < n2)) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;
            }
            i++;
        }
        ekok = (n1 * n2) / ebob;
        System.out.println("Ebob : " + ebob);
        System.out.print("Ekok : " + ekok);


    }
}