package rankUp.D;

import java.util.Scanner;

public class P077D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var result = sc.nextInt() * sc.nextInt();
        System.out.println(result >= 10000 ? "NG" : result);
    }
}
