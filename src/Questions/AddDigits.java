package Questions;

import java.util.Arrays;

// https://leetcode.com/problems/add-digits/
public class AddDigits {
    static int addDigits(int num) {
        if (num == 0) {
        return 0;
        }
        if (num % 9 == 0) {
        return 9;
        }
        return num % 9;
    }
//static int addDigits(int num) {
//    if(num <= 9){
//        return num;
//    }
//    int n = (int)Math.log10(num)+1;
//    int[] result = new int[n];
//
//    for (int i = n - 1; i >= 0; i--) {
//        result[i] = num % 10;
//        num = num / 10;
//    }
//    int x =0;
//    for (int i = 0 ; i < n; i++) {
//        x += result[i];
//    }
//    System.out.print(Arrays.toString(result));
//
//    return addDigits(x);
//}
  public static void main(String[] args) {
    System.out.println(addDigits(38));
  }
}
