package rankUp.C;

import java.util.Scanner;

public class P048C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        var price = sc.nextInt();
        final var discount = sc.nextInt();

        var resultPrice = 0;
        while (true) {
            resultPrice += price;
            price = price * (100 - discount) / 100;
            if (price <= 0) {
                break;
            }
        }
        System.out.println(resultPrice);
    }
}
