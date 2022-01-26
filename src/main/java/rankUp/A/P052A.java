package rankUp.A;

import java.util.Arrays;
import java.util.Scanner;

public class P052A {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var stairCount = sc.nextInt();
        final var aStepCount = sc.nextInt();
        final var bStepCount = sc.nextInt();
        final var stepCountArray = new int[]{aStepCount, bStepCount};

        var stepArray = new int[stairCount];
        Arrays.fill(stepArray, 1);

        var sum = -1;
        for(var i = 0; i < stairCount; i++) {
            sum += stepCountArray[0];
            if(sum >= stairCount) {
                stepArray[stairCount -1] = 0;
                break;
            }
            stepArray[sum] = 0;
        }

        sum = -1;
        for(var i = 0; i < stairCount; i++) {
            sum += stepCountArray[1];
            if(sum >= stairCount) {
                stepArray[stairCount -1] = 0;
                break;
            }
            stepArray[sum] = 0;
        }

        sum = -1;
        var index = 0;
        for(var i = 0; i < stairCount; i++) {
            sum += stepCountArray[index];
            index = index == 0 ? 1 : 0;
            if(sum >= stairCount) {
                stepArray[stairCount -1] = 0;
                break;
            }
            stepArray[sum] = 0;
        }

        sum = -1;
        index = 1;
        for(var i = 0; i < stairCount; i++) {
            sum += stepCountArray[index];
            index = index == 0 ? 1 : 0;
            if(sum >= stairCount) {
                stepArray[stairCount -1] = 0;
                break;
            }
            stepArray[sum] = 0;
        }


        var result = Arrays.stream(stepArray).sum();
        System.out.println(result);

        sc.close();
    }
}

