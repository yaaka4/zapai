package rankUp.D;

import java.util.Scanner;

public class P164D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final var num = sc.nextInt();
        final String result;
        if(num == Math.pow(2, 1) || num == Math.pow(2, 2) ||num == Math.pow(2, 3) ||num == Math.pow(2, 4) ||num == Math.pow(2, 5) ||num == Math.pow(2, 6) ||num == Math.pow(2, 7) ||num == Math.pow(2, 8)) {
            result = "OK";
        } else {
            result = "NG";
        }
        System.out.println(result);
    }
}
