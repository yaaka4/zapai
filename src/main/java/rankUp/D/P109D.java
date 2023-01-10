package rankUp.D;

import java.util.Scanner;

public class P109D {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final var month = sc.nextInt();
        final var date = sc.nextInt();
        final String result;
        if (month == date) {
            result = "Yes";
        } else if(month == 1 && date == 11) {
            result = "Yes";
        } else if(month == 11 && date == 1) {
            result = "Yes";
        } else if(month == 2 && date == 22) {
            result = "Yes";
        } else if(month == 22 && date == 2) {
            result = "Yes";
        } else {
            result = "No";
        }

        System.out.println(result);
    }
}
