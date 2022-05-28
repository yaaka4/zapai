package rankUp.D;

import java.util.*;

public class P103D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        List<String> lineList = Arrays.asList(sc.nextLine().split(""));
        Collections.reverse(lineList);
        lineList.forEach(System.out::print);
        System.out.println();
    }
}
