import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Lütfen bir sayı giriniz : ");
        n = input.nextInt();

        for(int i= 1; i < n; i++){
           for(int k = 1; k <= i ;k++){
               System.out.print(" ");

           }for(int l=1; l<= ((2*n-1)-(2*i));l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}