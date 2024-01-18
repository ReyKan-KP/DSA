package Questions;
// https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    static int reverse(int x) {
        int ans = 0;
        int x1 = 0;
        if (x < 0) {
            x1 = x * -1;
        } else {
            x1 = x;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(x1);
        sb.reverse();

        try {
            ans = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        // System.out.print(ans);

        if (x < 0) {
            ans = -1 * ans;
        }
        return ans;
    }

  public static void main(String[] args) {
    System.out.println(reverse(15349));
  }
}
