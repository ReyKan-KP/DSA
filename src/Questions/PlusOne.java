package Questions;
// https://leetcode.com/problems/plus-one/
import java.util.Arrays;

public class PlusOne {
    static int[] plusOne(int[] digits) {
//        int x = 0;
//        int n = digits.length;
//        for(int i=0; i<n;i++){
//            x = x + digits[i]*(int) Math.pow(10, n - i - 1);
//        }
//        x =x+1;
//        System.out.print(x);
//        int numOfDigits = (int) Math.log10(x) + 1;
//
//        int[] result = new int[numOfDigits];
//
//        for (int i = numOfDigits - 1; i >= 0; i--) {
//            result[i] = x % 10;
//            x = x / 10;
//        }
//
//        return result;
        int n = digits.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        } else {
            return digits;
        }
    }

  public static void main(String[] args) {
    int[] arr = {9,8,7,6,5,4,3,2,1,0};
    System.out.println(Arrays.toString(plusOne(arr)));
  }
}
