import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();
        int[] numbers = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Eleman : ");
            numbers[i] = input.nextInt();
        }

        boolean[] counted = new boolean[n];

        System.out.println("Tekrar sayıları:");
        for (int i = 0; i < n; i++) {
            if (counted[i]) continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(numbers[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}