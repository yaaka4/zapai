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

//        IntStream.rangeClosed(1, n)
//                .forEach(s -> {
//                    if (s % x == 0) {
//                        System.out.print("A");
//                    }
//                    if (s % y == 0) {
//                        System.out.print("B");
//                    }
//                    if (s % x != 0 && s % y != 0) {
//                        System.out.print("N");
//                    }
//                    System.out.println();
//                });
        IntStream.rangeClosed(1, n)
                .forEach(s -> System.out.println(
                        switch (s % x) {
                            case 0 -> "A";
                            default -> "N";
                        }
                        +
                        switch (s % y) {
                            case 0 -> "B";
                            default -> "N";
                        }
                ));

        sc.close();
    }
}