package rankUp.D;

import java.util.Arrays;
import java.util.Scanner;

public class P023D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.stream(sc.next().split("")).filter(c -> c.equals("A")).count());
    }
}
