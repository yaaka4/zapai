package projava;

public class ContinuePractice {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            if (i == 3) continue;
            System.out.println(i);
        }
        System.out.println("------------");
        for (int i = 0; i <= 9; i++) {
            if (i == 3 || i == 5) continue;
            System.out.println(i);
        }
        System.out.println("------------");
        for (int i = 0; i <= 9; i++) {
            if (3 <= i && i <= 6) continue;
            System.out.println(i);
        }
    }
}
