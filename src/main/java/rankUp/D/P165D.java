package rankUp.D;

import java.util.Scanner;

public class P165D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final var numArray = sc.next().split("");

        var result = "OK";
        for(var i = 0; i < numArray.length; i++) {
            for (var j = i; j < numArray.length; j++) {
                if (i != j && numArray[i].equals(numArray[j])) {
                    result = "NG";
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
