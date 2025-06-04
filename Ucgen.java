import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
      int n;
        System.out.println("Ters üçgen yapma programına hoş geldiniz !!");
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        n = input.nextInt();

        for (int i =n; i>=1; i--){
            for (int j = 0; j< (2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}