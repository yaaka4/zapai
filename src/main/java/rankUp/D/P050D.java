package rankUp.D;

import java.util.Scanner;

public class P050D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var n1 = sc.nextInt();
        var n2 = sc.nextInt();
        System.out.println((Math.min(n1, 5)) + (Math.min(n2, 5)));
    }
}
