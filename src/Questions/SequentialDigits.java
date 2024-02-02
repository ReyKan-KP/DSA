package Questions;

import java.util.*;

public class SequentialDigits {
  static List<Integer> sequentialDigits(int low, int high) {
    List<Integer> list = new ArrayList<>();
    String s = "123456789";
    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j <= s.length(); j++) {
        int n = Integer.parseInt(s.substring(i, j));
        if (n <= high && n >= low) {
          list.add(n);
        }
      }
    }
    list.sort(null);
    return list;
  }

  public static void main(String[] args) {
    int low = 100;
    int high = 300;
    System.out.println(sequentialDigits(low, high));
  }
}
