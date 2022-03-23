package projava;

public class RecLoop {
    public static void main(String[] args) {
        loop(0);
        loop2(3);
    }

    private static void loop2(int i) {
        if (i <= 0) {
            return;
        }
        System.out.println(i);
        loop2(i - 1);
    }

    private static void loop(int i) {
        if (i >= 5) {
            return;
        }
        System.out.println(i);
        loop(i + 1);
    }
}
