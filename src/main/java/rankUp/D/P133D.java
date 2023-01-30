package rankUp.D;

import java.util.Scanner;

public class P133D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final var money = sc.nextInt();
        final var buyPrice = sc.nextInt();
        final var sellPrice = sc.nextInt();
        System.out.println(money / buyPrice * sellPrice - money);
    }
}
