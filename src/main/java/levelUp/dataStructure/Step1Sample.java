package levelUp.dataStructure;

import java.util.*;

public class Step1Sample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        if (a.contains(b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}