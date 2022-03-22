package projava;

public class ForSample {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            System.out.println(n);
        }
        System.out.println("---------------");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("--------------");
        for (int j = 0; j < 5; j++) {
            if (j == 2) {
                System.out.println("skip");
                continue;
            }
            System.out.println(j);
        }
        System.out.println("--------------");
        for (int j = 0; j < 5; j++) {
            if (j == 2) {
                System.out.println("skip");
            } else {
                System.out.println(j);
            }
        }
    }
}
