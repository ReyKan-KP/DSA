package Questions;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/add-to-array-form-of-integer/description/
public class AddToArrayFormOfInteger {

    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int carry = 0;
        int i = num.length - 1;

        while (i >= 0 || k > 0 || carry > 0) {
            int x = i >= 0 ? num[i] : 0;
            int y = k % 10;
            int sum = x + y + carry;

            result.add(0, sum % 10);
            carry = sum / 10;

            i--;
            k /= 10;
        }

        return result;
    }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 3, 1};
    System.out.println(addToArrayForm(arr, 3));
  }
}
