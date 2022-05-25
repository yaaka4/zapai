package rankUp.D;

import java.util.Scanner;

public class P019D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var a = sc.next();
        var b = sc.nextInt();
        System.out.println(a.substring(b - 1, b));
    }
}
