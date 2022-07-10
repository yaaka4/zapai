package rankUp.D;

import java.util.Scanner;

public class P065D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var first = sc.next().split("")[0];
        System.out.println(switch(first) {
            case "4" -> "error";
            case "2" -> "ok";
            default -> "unknown";
        });
    }
}
