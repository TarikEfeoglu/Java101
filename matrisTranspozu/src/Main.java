import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını giriniz: ");
        int row = input.nextInt();
        System.out.print("Matrisin sütun sayısını giriniz: ");
        int col = input.nextInt();

        int[][] matrix = new int[row][col];
        int[][] transpose = new int[col][row];

        System.out.println("Matris elemanlarını giriniz:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nMatris:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrisin Transpozu:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
