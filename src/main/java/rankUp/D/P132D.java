package rankUp.D;

import java.util.Scanner;

public class P132D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var count = sc.nextInt();
        var word = sc.next();
        System.out.println(word.repeat(count));
    }
}
