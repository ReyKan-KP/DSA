package Questions;

import java.util.*;

public class mazeProblem {
  static int count(int r, int c) {
    if (r == 1 || c == 1) {
      return 1;
    }
    int left = count(r - 1, c);
    int right = count(r, c - 1);
    return left + right;
  }

  static void path(String p, int r, int c) {
    if (r == 1 && c == 1) {
      System.out.println(p);
      return;
    }
    if (r > 1) {
      path(p + 'D', r - 1, c);
    }
    if (c > 1) {
      path(p + 'R', r, c - 1);
    }
  }

  public static void main(String[] args) {
    int r = 4;
    int c = 3;
    System.out.println(count(r, c));
    path("", 4, 3);
  }
}
