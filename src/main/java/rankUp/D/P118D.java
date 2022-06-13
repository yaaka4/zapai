package rankUp.D;

import java.util.Scanner;

public class P118D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        System.out.println(switch(sc.next()) {
            case "S" -> 1926 + sc.nextInt() - 1;
            case "H" -> 1989 + sc.nextInt() - 1;
            default -> sc.nextInt();
        });
    }
}
