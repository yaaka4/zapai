package rankUp.C;

import java.util.*;
import java.util.stream.*;

public class P097C {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        var sc = new Scanner(System.in);
        var line = sc.nextLine();
        var array = line.split(" ");
        var n = Integer.parseInt(array[0]);
        var x = Integer.parseInt(array[1]);
        var y = Integer.parseInt(array[2]);

        IntStream.rangeClosed(1, n)
                .forEach(s -> {
                    var result = "";
                    if (s % x == 0) {
                        result += "A";
                    } else {
                        result += "N";
                    }
                    if (s % y == 0) {
                        result += "B";
                    } else {
                        result += "N";
                    }
                    System.out.println(result);
                }
                );

        sc.close();
    }
}