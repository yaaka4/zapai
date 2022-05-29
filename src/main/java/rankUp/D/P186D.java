package rankUp.D;

import java.util.Scanner;

public class P186D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var tempo = sc.nextInt();
        System.out.println(tempo < 35 && tempo >= 30 ? "M" : tempo);
    }
}
