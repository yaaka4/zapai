package rankUp.D;

import java.util.Scanner;

public class P071D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var t = sc.nextInt();
        var m = sc.nextInt();
        if(t >= 25 && m <= 40) {
            System.out.println("No");
        } else if(t >= 25 || m <= 40) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
