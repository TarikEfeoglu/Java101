public class Main {
    public static void main(String[] args) {
        int[] dizi = {1,5,6,7,9,10,12};

        double harmonikSeri = 0.0;
        for (int i = 0; i < dizi.length; i++) {
            harmonikSeri += 1.0 / dizi[i];
        }

        double harmonikOrtalama = dizi.length / harmonikSeri;

        System.out.println("Dizinin Harmonik Ortalaması: " + harmonikOrtalama);
    }
}
