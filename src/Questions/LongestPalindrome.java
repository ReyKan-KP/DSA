package Questions;

// https://leetcode.com/problems/longest-palindrome/
import java.util.*;

public class LongestPalindrome {
  static int longestPalindrome(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    }
    int count = 0;
    boolean flag = false;

    for (int k : map.values()) {
      count += k / 2 * 2;
      if (k % 2 == 1) {
        flag = true;
      }
    }

    return flag ? count + 1 : count;
  }

  public static void main(String[] args) {
    String s = "abccccdd";
    System.out.println(longestPalindrome(s));
  }
}
