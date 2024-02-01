package Questions;

// https://leetcode.com/problems/first-unique-character-in-a-string/
import java.util.*;

public class FirstUniqueCharacterInAString {
  static int firstUniqChar(String s) {
    for (int i = 0; i < s.length(); i++) {
      int j = s.charAt(i);
      if (i == s.lastIndexOf(j) && i == s.indexOf(j)) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    String str = "leetcode";
    System.out.println(firstUniqChar(str));
  }
}
