import java.util.Scanner;
import java.util.stream.IntStream;

public class P101C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var luckyDay = sc.nextLine();

        final var resultCount = IntStream.range(0, 365)
                .mapToObj(String::valueOf)
                .filter(dayStr -> dayStr.contains(luckyDay))
                .count();

        System.out.println(resultCount);

        sc.close();
    }
}