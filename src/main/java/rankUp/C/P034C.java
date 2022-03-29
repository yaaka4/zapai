package rankUp.C;

import java.util.Scanner;

public class P034C {
    private final static String QUESTION = "x";
    private final static String PLUS ="+";

    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var first = sc.next();
        final var operand = sc.next();
        final var second = sc.next();
        sc.next();
        final var answer = sc.next();
        
        var result = 0;
        if (first.equals(QUESTION)) {
            result = operand.equals(PLUS) ? calcMinus(answer, second) : calcPlus(answer, second);
        } else if (second.equals(QUESTION)) {
            result = operand.equals(PLUS) ? calcMinus(answer, first) : calcMinus(first, answer);
        } else {
            result = operand.equals(PLUS) ? calcPlus(first, second) : calcMinus(first, second);
        }
        System.out.println(result);

        sc.close();
    }

    private static int calcMinus(String right, String left) {
        return Integer.parseInt(right) - Integer.parseInt(left);
    }

    private static int calcPlus(String right, String left) {
        return Integer.parseInt(right) + Integer.parseInt(left);
    }
}
