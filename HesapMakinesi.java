import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayınızı giriniz: ");
        n1 = inp.nextInt();
        System.out.print("İkinci sayınızı giriniz: ");
        n2 = inp.nextInt();

        System.out.println("1-topam\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("Seçeneğiniz nedir = ");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam =" + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma =" + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma = " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Bölme işleminde payda '0' olamaz");

                }
                else if(n1<n2){
                    System.out.println("İlk sayınız küçük olamaz. Büyük sayı seçiciniz.");                }
                else {
                    System.out.println("Bölme = " + (n1 / n2));
                }

                break;
            default:
                System.out.println("Yanlış seçim yaptınız bir. Bir daha deneyiniz. ");

        }

         {

        }
    }
}