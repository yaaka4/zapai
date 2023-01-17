package rankUp.D;

import java.util.Scanner;

public class P092D {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var first = sc.nextLine();
        final var second = sc.nextLine();
        final var firstArray = first.split(" ");
        final var secondArray = second.split(" ");

        final String result;
        if(calcCost(firstArray) > calcCost(secondArray)) {
            result = second;
        } else if(calcCost(firstArray) < calcCost(secondArray)) {
            result = first;
        } else {
            result = "DRAW";
        }

        System.out.println(result);
        sc.close();
    }

    private static double calcCost(String[] sheetArray) {
        return Double.parseDouble(sheetArray[2]) / (Double.parseDouble(sheetArray[0]) * Double.parseDouble(sheetArray[1]));
    }
}
