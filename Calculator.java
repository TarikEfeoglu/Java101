import java.util.Scanner;

public class Calculator {
    static int plus(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;

    }

    static int extraction(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci sayı sıfırdan farklı olmalıdır!!");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üssü : " + result);
        return result;
    }

    static int mod(int a, int b) {
        return a % b;

    }


    static void calc(int a, int b) {
        System.out.println("Dikdörtgenin alanı : " + a * b);
        System.out.println("Dikdörtgenin çevresi : " + 2 * (a + b));
    }

    static int faktor(int a) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Sonuç : " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int select;

        String menü = "1.Toplama işlemi\n" +
                "2.Çıkarma işlemi\n"
                + "3.Çarpma işlemi\n"
                + "4.Bölme işlemi\n"
                + "5.Üslü hesaplama işlemi\n"
                + "6.Mod alma işlemi\n"
                + "7.Dikdörtgen çevre ve alan hesaplama işlemi\n"
                + "8.Faktöriyel hesapla\n"
                + "0. Çıkış yap\n";
        System.out.print(menü);
        while (true) {

            System.out.print("Bir işlem seçiniz : ");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("İlk sayıyı giriniz : ");
            int a = scan.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    plus(a, b);
                    break;
                case 2:
                    extraction(a, b);
                    break;
                case 3:
                    multiplication(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    System.out.println(mod(a, b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                case 8:
                    faktor(a);
                    break;
                case 0:
                    break;

                    default:
                    System.out.println("Geçersiz giriş yaptınız!!");

            }
            while (select != 0) ;
        }
        System.out.println("Güle güle!!");
    }
}
