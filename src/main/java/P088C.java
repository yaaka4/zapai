import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P088C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var line = sc.nextLine();

        final var itemCount = Integer.parseInt(line);
        final var priceArray = returnIntArray(sc, " ");
        final var infoArray = returnIntArray(sc, " ");

        var money = infoArray[0];
        final var purchaseCount = infoArray[1];

        final var purchasePriceList = IntStream.range(0, purchaseCount)
                .mapToObj(i -> returnIntArray(sc, " "))
                .map(array -> priceArray[array[0] - 1] * array[1])
                .toList();

        for(int price : purchasePriceList) {
            if (money >= price) {
                money -= price;
            }
        }

        System.out.println(money);

        sc.close();
    }

    private static int[] returnIntArray(Scanner sc, String splitRegex) {
        return Stream.of(sc.nextLine().split(splitRegex))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}