package projava;

import java.util.ArrayList;
import java.util.List;

public class StreamSample2 {
    public static void main(String[] args) {
        var data = List.of("yamamoto", "kis", "sugiyama");

        var result = (int) data.stream()
                .filter(a -> a.length() >= 5)
                .count();
        System.out.println(result);
        System.out.println("-----------------------");
        var fruits = List.of("apple", "banana", "grape");

        for (var s : fruits) {
            if (s.length() == 5) {
                System.out.println(s);
            }
        }
        System.out.println("-----------------------");
        var result2 = new ArrayList<String>();
        for (var s : fruits) {
            if (s.length() == 5) {
                result2.add(s);
            }
        }
        System.out.println(result2);
        System.out.println("-----------------------");
        var result3 = 0;
        for (var s : fruits) {
            if (s.length() == 5) {
                result3++;
            }
        }
        System.out.println(result3);
        System.out.println("-----------------------");
        var list = new ArrayList<String>();
        var result4 = false;
        for (var s : fruits) {
            if (s.length() == 5) {
                if (s.contains("p")) {
                    result4 = true;
                } else {
                    result4 = false;
                    break;
                }
            }
        }
        System.out.println(result4);
        System.out.println("-----------------------");
        var result5 = false;
        for (var s : fruits) {
            if (s.length() == 5 && s.contains("p")) {
                result5 = true;
            }
        }
        System.out.println(result5);
    }
}
