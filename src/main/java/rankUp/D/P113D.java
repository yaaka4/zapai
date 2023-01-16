package rankUp.D;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P113D {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final DateTimeFormatter hmFormat = DateTimeFormatter.ofPattern("H:m");
        final LocalTime time = LocalTime.parse(sc.next(), hmFormat);

        System.out.println(time.minusHours(8).format(hmFormat));
        sc.close();
    }
}
