public class Asal {
    public static void main(String[] args) {

                int i, x, j;
                for (i = 1; i < 100; i++) {
                    x = 2;
                    j = 0;

                    while (x != (int)(Math.sqrt(i)) + 1){
                        if (i % x == 0) {
                            j = 1;
                            break;
                        } else x++;
                    }
                    if (j == 0)
                        System.out.print(i+",");
                }
            }
        }
