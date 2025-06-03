import java.util.Scanner;

public class Mukemmel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total=0;
        int number;

        System.out.print("Bir sayı giriniz : ");
        number = inp.nextInt();

        for (int i=1; i<number ;i++){
            if (number%i==0){
                total += i;
            }
        }
        if (total==number){
            System.out.println(number+ " Mükemmel sayı!");
        }else {
            System.out.println(number+ " Mükemmel sayı değildir!!");
        }
    }
}