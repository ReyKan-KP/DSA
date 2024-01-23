package Questions;
//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
import java.util.*;

public class DetermineIfStringHalvesAreAlike {

  static boolean halvesAreAlike(String s) {
    String vowels = "aeiou";
    s = s.toLowerCase();
    int n = s.length();
    int count = 0;
    for (int i = 0; i < n / 2; i++) {
      if (vowels.indexOf(s.charAt(i)) != -1) {
        count++;
      }
      if (vowels.indexOf(s.charAt(i + n / 2)) != -1) {
        count--;
      }
    }
    return (count == 0);

  }

  public static void main(String[] args) {
    String str = "book";
    System.out.println(halvesAreAlike(str));
  }
}
