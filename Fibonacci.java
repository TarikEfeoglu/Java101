import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ilk = 0, ikinci = 1;
        int n;
        System.out.print("Sayı örgüsü için bir sayı giriniz : ");
        n = inp.nextInt();

        for (int i =0; i<=n; i++){
            int sonraki = ilk + ikinci;

            System.out.print(ilk + " + " + ikinci + " ="+ sonraki + "\n");

            ilk = ikinci;
            ikinci = sonraki;
        }
    }
}