import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime gir: ");
        String kelime = input.nextLine();

        int uzunluk = kelime.length();
        boolean palindrom = true;

        for (int i = 0; i < uzunluk / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(uzunluk - 1 - i)) {
                palindrom = false;
                break;
            }
        }

        if (palindrom) {
            System.out.println("Bu kelime palindromdur!");
        } else {
            System.out.println("Bu kelime palindrom değildir!");
        }

        input.close();
    }
}
