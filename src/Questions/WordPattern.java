package Questions;

// https://leetcode.com/problems/word-pattern/description/
import java.util.*;

public class WordPattern {
  static boolean wordPattern(String pattern, String s) {

    String[] strs = s.split("\s");
    if (pattern.length() != strs.length) {
      return false;
    }
    Map<Character, String> map1 = new HashMap<>();
    Map<String, Character> map2 = new HashMap<>();
    for (int i = 0; i < pattern.length(); i++) {
      char c = pattern.charAt(i);
      String str = strs[i];

      if (!map1.containsKey(c)) {
        map1.put(c, str);
      }

      if (!map2.containsKey(str)) {
        map2.put(str, c);
      }

      if (!map1.get(c).equals(str) || !map2.get(str).equals(c)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String pattern = "abba";
    String s = "dog cat cat dog";
    System.out.println(wordPattern(pattern, s));
  }
}
