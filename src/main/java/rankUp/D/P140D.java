package rankUp.D;

import java.util.Scanner;

public class P140D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var num = sc.nextInt();
        sc.nextLine();
        System.out.println(sc.nextLine().split(" ")[num - 1]);
    }
}
