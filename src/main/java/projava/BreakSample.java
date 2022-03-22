package projava;

public class BreakSample {
    public static void main(String[] args) {
        System.out.println("--------------");
        for (int j = 0; j < 5; j++) {
            if (j == 2) {
                System.out.println("finish");
                break;
            }
            System.out.println(j);
        }
        System.out.println("--------------");
        for (int i = 0; i < 5; i++) {
            if (i != 2) {
                System.out.println(i);
                continue;
            }
            System.out.println("finish");
            break;
        }
    }
}
