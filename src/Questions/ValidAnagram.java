package Questions;

// https://leetcode.com/problems/valid-anagram/
import java.util.*;

public class ValidAnagram {
  static boolean isAnagram(String s, String t) {
    char[] c1 = s.toCharArray();
    char[] c2 = t.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    return (Arrays.equals(c1, c2));
  }

  public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";
    System.out.println(isAnagram(s, t));
  }
}
