package rankUp.D;

import java.util.Scanner;

public class P054D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var count = sc.next().split("").length;
        System.out.println(count >= 11 ? "OK" : 11 - count);
    }
}
