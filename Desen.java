import java.util.Scanner;

public class Desen {
    static void desen(int n) {
        System.out.print(n + " ");

        if (n > 0) {
            desen(n - 5);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int n = scanner.nextInt();
        desen(n);
    }
}
