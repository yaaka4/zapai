package rankUp.D;

import java.util.Scanner;

public class P045D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var num = sc.nextInt();
        var result = switch(num) {
            case 5 -> "A";
            case 4 -> "B";
            case 3 -> "C";
            case 2 -> "D";
            case 1 -> "E";
            default -> "E";
        };
        System.out.println(result);
    }
}
