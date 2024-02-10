package Questions;

// https://leetcode.com/problems/palindromic-substrings/description/
import java.util.*;

public class PalindromicSubstrings {
  static int countSubstrings(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length(); j++) {
        String sub = s.substring(i, j + 1);
        if (isPalindrome(sub)) {
          count++;
        }
      }
    }
    return count;
  }

  static boolean isPalindrome(String s) {
    int start = 0;
    int end = s.length() - 1;
    while (start <= end) {
      if (s.charAt(start) != s.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "abc";
    System.out.println(countSubstrings(s));
  }
}
