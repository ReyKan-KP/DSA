package Questions;

// https://leetcode.com/problems/keyboard-row/description/
import java.util.*;

public class KeyboardRow {
  static String[] findWords(String[] words) {
    String r1 = "qwertyuiopQWERTYUIOP";
    String r2 = "asdfghjklASDFGHJKL";
    String r3 = "zxcvbnmZXCVBNM";

    List<String> result = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
      boolean inRow1 = true, inRow2 = true, inRow3 = true;

      for (int j = 0; j < words[i].length(); j++) {
        char c = words[i].charAt(j);

        if (!r1.contains(String.valueOf(c))) {
          inRow1 = false;
        }

        if (!r2.contains(String.valueOf(c))) {
          inRow2 = false;
        }

        if (!r3.contains(String.valueOf(c))) {
          inRow3 = false;
        }
      }

      if (inRow1 || inRow2 || inRow3) {
        result.add(words[i]);
      }
    }
    String[] s = result.toArray(new String[0]);
    return s;
  }

  public static void main(String[] args) {
    String[] words = {"Hello", "Alaska", "Dad", "Peace"};
    String[] result = findWords(words);
    for (String s : result) {
      System.out.println(s);
    }
  }
}
