import java.util.Scanner;

public class GİrisBilgisi {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi girin: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız !");

        } else {
            System.out.println("Bilgileriniz yanlış !\nYeni şifre oluşturulsun mu ? \n1-Evet . 0-Hayır");
            int changePassword = inp.nextInt();
            inp.nextLine();
            if (changePassword == 1) {
                System.out.print("Yeni şifrenizi girin = ");
                password = inp.nextLine();

                if (password.equals("java123")) {
                    System.out.print("Şifre oluşturulamadı! Lütfen yeniden deneyin.");

                } else {
                    System.out.print("Şifre başarıyla değiştirildi");
                }
            }else {
                System.out.println("Allaha emanet ol !!");
            }


        }


    }
}