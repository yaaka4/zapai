package rankUp.C;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class P109C {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var num = sc.nextInt();
        sc.nextLine();

        final var listString = IntStream.range(0, num)
                .mapToObj(i -> sc.nextLine())
                .toList();

        Map<Integer, String> resultMap = new TreeMap<>();
        for(var str : listString) {
            int i;
            for(i = 0; i < str.length(); i++) {
                var c = str.charAt(i);
                if(Character.isDigit(c)) {
                    break;
                }
            }
            resultMap.put(Integer.parseInt(str.substring(i)), str);
        }
        for (Integer nKey : resultMap.keySet())
        {
            System.out.println(resultMap.get(nKey));
        }

        sc.close();
    }
}
