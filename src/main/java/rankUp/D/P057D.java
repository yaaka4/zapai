package rankUp.D;

import java.util.Scanner;

public class P057D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var result = sc.nextInt();
        var a = sc.next();
        var b = sc.next();
        var c = sc.next();
        System.out.println(switch(result) {
            case 1 -> a;
            case 2 -> b;
            case 3 -> c;
            default -> "";
        });
    }
}
