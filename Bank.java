import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int balance = 1500;
        int right = 3;
        int select;
        int price;


        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = inp.nextLine();
            System.out.print("Şifreniz : ");
            password = inp.nextLine();

            if (userName.equals("Tarık") && password.equals("Van6565")) {
                System.out.println("Sisteme hoşgeldiniz!!");

                do {
                    System.out.println("Menü :  \n" + "1 - Para Yatırma \n" + "2 - Para Çekme \n" +
                            "3 - Bakiye Sorgulama \n" + "4 - Çıkış yap ");


                    System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();

                    switch (select) {

                        case 1:
                            System.out.print("Para miktarı :  ");
                            price = inp.nextInt();
                            balance += price;
                            break;

                        case 2:

                            System.out.print("Para miktarı :  ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz yetersiz !!");
                            } else {
                                balance -= price;
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select == 4);
                System.out.println("Tekrar Görüşmek üzere");
                break;

            } else {
                right--;
                System.out.println("Hatalı giriş yaptınız!!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.Bankayla iletişim kurun.");
                } else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }
    }
}
