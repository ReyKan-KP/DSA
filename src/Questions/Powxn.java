package Questions;

// https://leetcode.com/problems/powx-n/description/
public class Powxn {
  static double myPow(double x, int n) {
    return Math.pow(x, n);
  }

  public static void main(String[] args) {
    double x = 2.00000;
    int n = 10;
    System.out.println(myPow(x, n));
  }
}
