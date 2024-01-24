package Questions;

import java.util.*;

public class ReversePrefixOfWord {
  static String reversePrefix(String word, char ch) {
    int k = 0;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == ch) {
        k = i;
        break;
      }
    }
    StringBuilder str1 = new StringBuilder(word.substring(0, k + 1));
    StringBuilder str2 = new StringBuilder(word.substring(k + 1));

    str1.reverse();
    str1.append(str2);
    return str1.toString();
  }

  public static void main(String[] args) {
    String word = "abcdefd";
    char ch = 'd';
    System.out.println(reversePrefix(word, ch));
  }
}
