package rankUp.D;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P153D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final List<Integer> priceList =
                IntStream.range(0, 3)
                        .mapToObj(i -> sc.nextInt())
                        .sorted()
                        .toList();
        System.out.println(priceList.get(1));
    }
}
