package Questions;

import java.util.*;

public class IsomorphicStrings {
  static boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    Map<Character, Character> map1 = new HashMap<>();
    Map<Character, Character> map2 = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char charS = s.charAt(i);
      char charT = t.charAt(i);

      if (!map1.containsKey(charS)) {
        map1.put(charS, charT);
      }
      if (!map2.containsKey(charT)) {
        map2.put(charT, charS);
      }
      if (!map1.get(charS).equals(charT) || !map2.get(charT).equals(charS)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "egg";
    String t = "add";
    System.out.println(isIsomorphic(s, t));
  }
}
