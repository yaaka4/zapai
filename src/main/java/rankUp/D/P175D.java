package rankUp.D;

import java.util.Scanner;

public class P175D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var num = sc.next();
        System.out.println(num.equals("A") ? 10 : num.equals("B") ? 11 : num);
    }
}
