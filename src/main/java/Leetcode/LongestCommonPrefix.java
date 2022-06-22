package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs[0].isEmpty()) {
            return "";
        }
        if (strs.length <= 1) {
            return strs[0];
        }

        Set<String> set = new HashSet<>();
        for (int i = 1; i <= strs[0].length(); i++) {
            set.add(strs[0].substring(0, i));
        }

        var result = "";
        for (int i = 0; i < strs[1].length(); i++) {
            final var tmp = strs[1].substring(0, strs[1].length() - i);
            if(set.contains(tmp)) {
                result = tmp;
                break;
            }
        }

        for (int i = 2; i < strs.length; i++) {
            var stri = strs[i];
            while(stri.length() > 0) {
                if(result.length() > stri.length()) {
                    result = result.substring(0, stri.length());
                }
                if(!result.equals(stri)) {
                    stri = stri.substring(0, stri.length() - 1);
                    continue;
                }
                break;
            }
            if(stri.length() == 0) {
                result = "";
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        var array = new String[]{"flower","flow","flight"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(array));
    }
}
