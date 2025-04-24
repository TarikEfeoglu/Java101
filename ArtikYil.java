import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
       int kalan1, kalan2,yıl;
        Scanner inp =new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz : ");
        yıl = inp.nextInt();
        kalan1 = yıl%4;
        kalan2 = yıl%400 ;
        if (yıl<0){
            System.out.println("Hatalı giriş yaptınız (0) sayısından küçük tarih girilemez!!");
            return;
        }
        if (kalan1== 0 || kalan2 ==0 && yıl>0 ){

            System.out.println(yıl+" : Artık yıl");
        }else {
            System.out.println(yıl+" : Artık yıl değil");
        }
    }
}