package rankUp.D;

import java.util.Scanner;

public class P150D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var a = sc.nextInt();
        var b = sc.nextInt();
        System.out.println(b - a <= 0 ? "Thank you" : b - a);
    }
}
