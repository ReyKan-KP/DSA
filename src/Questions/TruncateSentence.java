package Questions;

//https://leetcode.com/problems/truncate-sentence/
import java.util.*;

public class TruncateSentence {
  static String truncateSentence(String s, int k) {
    String[] strs = s.split("\\s");
    StringBuilder x = new StringBuilder();
    for (int i = 0; i < k; i++) {
      x.append(strs[i]).append(" ");
    }
    return x.toString().trim();
  }

  public static void main(String[] args) {
    String input = "This is a sample sentence to test the truncateSentence method";
    int k = 5;
    String result = truncateSentence(input, k);
    System.out.println("Truncated Sentence: " + result);
  }
}
