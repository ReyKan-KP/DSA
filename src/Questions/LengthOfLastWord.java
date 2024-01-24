package Questions;
// https://leetcode.com/problems/length-of-last-word/description/
import java.util.*;

public class LengthOfLastWord {
  static int lengthOfLastWord(String s) {
    String[] str = s.split(" ");
    return str[str.length-1].length();
  }

  public static void main(String[] args) {
    String s = "   Hello    World";
    System.out.println(lengthOfLastWord(s));
  }
}
