package rankUp.C;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P114C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        final var wordCount = sc.nextInt();
        final var wordList = IntStream.range(0, wordCount)
                .mapToObj(i -> sc.next())
                .toList();

        var result = "Yes";
        for(var i = 0; i + 1 < wordList.size(); i++) {
            if(!(wordList.get(i).substring(wordList.get(i).length() - 1).equals(wordList.get(i + 1).substring(0, 1)))) {
                result = wordList.get(i).substring(wordList.get(i).length() - 1) + " " +  wordList.get(i + 1).charAt(0);
                break;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
