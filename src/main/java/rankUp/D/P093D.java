package rankUp.D;

import java.util.Scanner;

public class P093D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var result = sc.next();
        final var numArray = result.split("");
        for (var i = 0; i < numArray.length - 1; i++) {
            if (!numArray[i].equals(numArray[i + 1])) {
                result = "No";
                break;
            }
        }
        System.out.println(result);
    }
}
