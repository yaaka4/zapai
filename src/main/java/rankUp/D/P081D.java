package rankUp.D;

import java.util.Scanner;

public class P081D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var family = sc.nextInt();
        var total = sc.nextInt() * sc.nextInt();
        System.out.println(total % family);
    }
}
