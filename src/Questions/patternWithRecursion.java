package Questions;

public class patternWithRecursion {
  static void upperTriangle(int r, int c) {
    if (r == 0) {
      return;
    }
    if (c < r) {
      System.out.print("*");
      upperTriangle(r, c + 1);
    } else {
      System.out.println();
      upperTriangle(r - 1, 0);
    }
  }

  static void lowerTriangle(int r, int c) {
    if (r == 0) {
      return;
    }
    if (c < r) {
      lowerTriangle(r, c + 1);
      System.out.print("*");
    } else {
      lowerTriangle(r - 1, 0);
      System.out.println();
    }
  }

  public static void main(String[] args) {
    upperTriangle(4, 0);
    lowerTriangle(4, 0);
  }
}
