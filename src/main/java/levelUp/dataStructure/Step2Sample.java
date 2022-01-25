package levelUp.dataStructure;

import java.util.*;

public class Step2Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        int prev = 0;
        for (int i = 0; i < n; i++) {
            int now = sc.nextInt();
            if (now == prev) {
                continue;
            }
            a.add(now);
            prev = now;
        }

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
            if (i < a.size() - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}
