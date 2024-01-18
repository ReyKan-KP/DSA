package Questions;
// https://leetcode.com/problems/a-number-after-a-double-reversal/
public class ANumberAfterADoubleReversal {
    static boolean isSameAfterReversals(int num) {
        int r1 = reverse(num);
        int r2 = reverse(r1);
        return r2 == num;
    }

    static int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x).reverse();
        return Integer.parseInt(sb.toString());
    }

  public static void main(String[] args) {
    System.out.println(isSameAfterReversals(12300));
  }
}
