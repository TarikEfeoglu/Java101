public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 2, 8, 10, 4, 12, 6, 14, 2};
        int[] duplicates = new int[numbers.length];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && numbers[i] % 2 == 0) {
                    if (!isFound(duplicates, numbers[i])) {
                        duplicates[index++] = numbers[i];
                    }
                    break;
                }
            }
        }

        System.out.print("Tekrar eden çift sayılar: ");
        for (int i = 0; i < index; i++) {
            System.out.print(duplicates[i] + " ");
        }
    }

    static boolean isFound(int[] arr, int value) {
        for (int i : arr) {
            if (i == value)
                return true;
        }
        return false;
    }
}