package Questions;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class evenNosOfDigitsOfElementInArray {
  static int countDigits(int num) {
    int count = 0;
    if (num < 0) {
      num = num * -1;
    }
    if (num == 0) {
      return 1;
    }
    while (num > 0) {
      count++;
      num = num / 10;
    }
    return count;
  }

  static int countDigits2(int num) {
    if (num < 0) {
      num = num * -1;
    }
    return (int) (Math.log10(num)) + 1;
  }

  static boolean even(int num) {
    int nosOFDigits = countDigits(num);
    //        int nosOFDigits2 = countDigits2(num);
    return nosOFDigits % 2 == 0;
    //        return nosOFDigits2 % 2 == 0;
  }

  static int findNos(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if (even(num)) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] nums = {12, 345, 2, 6, 7896};
    System.out.println(findNos(nums));
    System.out.println(countDigits2(-211231));
  }
}
