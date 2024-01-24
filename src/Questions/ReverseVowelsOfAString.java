package Questions;
// https://leetcode.com/problems/reverse-vowels-of-a-string/
import java.util.*;

public class ReverseVowelsOfAString {
  static String reverseVowels(String s) {
    String vowels = "aeiouAEIOU";
    char[] charArray = s.toCharArray();
    int i = 0;
    int j = s.length() - 1;

    while (i < j) {
      while (i < j && vowels.indexOf(charArray[i]) == -1) {
        i++;
      }

      while (i < j && vowels.indexOf(charArray[j]) == -1) {
        j--;
      }
      char temp = charArray[i];
      charArray[i] = charArray[j];
      charArray[j] = temp;

      i++;
      j--;
    }

    return new String(charArray);
  }

  public static void main(String[] args) {
    String str = "leetcode";
    System.out.println(reverseVowels(str));
  }
}
