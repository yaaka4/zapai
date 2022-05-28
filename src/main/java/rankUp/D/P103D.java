package rankUp.D;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P103D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String[] lineArray = sc.nextLine().split("");
        for(int i = lineArray.length - 1; i >= 0; i--) {
            System.out.print(lineArray[i]);
        }
        System.out.println();
    }
}
