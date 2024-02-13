package Questions;

// https://leetcode.com/problems/find-first-palindromic-string-in-the-array
import java.util.*;

public class FindFirstPalindromicStringInTheArray {

  static String firstPalindrome(String[] words) {
    for (int i = 0; i < words.length; i++) {
      if (isPalindrome(words[i])) {
        return words[i];
      }
    }
    return "";
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
    String[] words = {"abcd", "dcba", "lls", "s", "sssll"};
    System.out.println(firstPalindrome(words));
  }
}
