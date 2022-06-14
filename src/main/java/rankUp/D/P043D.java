package rankUp.D;

import java.util.Scanner;

public class P043D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        if (n <= 30) {
            System.out.println("sunny");
        } else if (n <= 70) {
            System.out.println("cloudy");
        } else {
            System.out.println("rainy");
        }
    }
}
