import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {

        int day, month;
        Scanner input = new Scanner(System.in);
        String burç= "";
        boolean isError = false;

        System.out.print("Doğum ayınızı girin : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz günü girin :");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                burç = (day < 22) ? "Oğlak burcu" : "Kova burcu";
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 28) {
                burç = (day < 20) ? "Kova Burcu" : "Balık burcu";
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                burç = (day < 20) ? "Balık burcu" : "Koç burcu";
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                burç = (day < 20) ? " Koç burcu " : "Boğa burcu";
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                burç = (day < 21) ? " Boğa burcu" : "İkizler burcu";
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                burç = (day < 22) ? "İkizler burcu" : "Yengeç burcu";
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                burç = (day < 22) ? " Yengeç burcu" : "Aslan burcu";
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                burç = (day < 22) ? " Aslan burcu" : "Başak burcu";
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                burç = (day < 22) ? " Başak burcu" : "Terazi burcu";
            } else {
                isError = true;
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                burç = (day < 22) ? " Terazi burcu" : "Akrep burcu";
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                burç = (day < 21) ? " Akrep burcu" : "Yay burcu";
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                burç = (day < 21) ? " Yay burcu" : "Oğlak burcu";
            } else {
                isError = true;
            }
        }if (isError){
            System.out.println("Hatalı işlem yaptınız! Tekrar deneyiniz.");
        }else {
            System.out.println("Burcun : "+burç);
        }
    }
}
