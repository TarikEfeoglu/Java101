import java.util.Scanner;

public class SayiKuvveti {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sınır seviyesi giriniz : ");
        n = input.nextInt();
System.out.println("(5'in kuvvetleri)");
        for (int i = 1; i <= n; i *= 5) {

            System.out.println(i);
        }
        System.out.println("----------------------------");
        System.out.println("(4'ün kuvvetleri)");
        for (int j=1; j<=n; j*=4){

            System.out.println(j);
        }
    }
}