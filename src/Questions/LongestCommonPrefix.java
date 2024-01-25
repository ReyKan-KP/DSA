package Questions;
//https://leetcode.com/problems/longest-common-prefix/
import java.util.*;

public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] strs) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return s.toString();
                }
            }
            s.append(currentChar);
        }
        return s.toString();
    }

  public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
