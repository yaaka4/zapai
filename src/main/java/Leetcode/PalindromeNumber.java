package Leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        final var strArray = String.valueOf(x).split("");
        final var reverseList = Arrays.asList(Arrays.copyOf(strArray, strArray.length));
        Collections.reverse(reverseList);
        return Arrays.equals(strArray, reverseList.toArray());
    }

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        System.out.println(pn.isPalindrome(10));
    }
}
