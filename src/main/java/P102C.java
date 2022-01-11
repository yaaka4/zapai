import java.util.Scanner;
import java.util.stream.IntStream;

public class P102C {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        final var sc = new Scanner(System.in);
        final var line = sc.nextLine();

        // LIVEA
        final var liveACount = Integer.parseInt(line);
        final var liveAArray = IntStream.range(0, liveACount)
                .map(i -> Integer.parseInt(sc.nextLine()))
                .boxed()
                .toList();

        // LIVEB
        final var liveBCount = Integer.parseInt(sc.nextLine());
        final var liveBArray = IntStream.range(0, liveBCount)
                .map(i -> Integer.parseInt(sc.nextLine()))
                .boxed()
                .toList();

        // 出力
        var abList = IntStream.rangeClosed(1, 31)
                .mapToObj(s -> {
                    final var isLiveA = liveAArray.contains(s);
                    final var isLiveB = liveBArray.contains(s);
                    if(isLiveA && isLiveB) {
                        return "C";
                    } else if(isLiveA) {
                        return "A";
                    } else if(isLiveB) {
                        return "B";
                    } else {
                        return "x";
                    }
                })
                .toList();

        var isPrimeA = true;
        for(var liveStr : abList) {
            if(liveStr.equals("C")) {
                System.out.println(isPrimeA ? "A" : "B");
                isPrimeA = !isPrimeA;
                continue;
            }
            System.out.println(liveStr);
        }

        sc.close();
    }
}