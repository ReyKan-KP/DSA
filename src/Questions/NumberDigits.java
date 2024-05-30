package Questions;

import java.util.*;

public class NumberDigits {
  public static List<Integer> getDigits(int number) {
    List<Integer> digits = new ArrayList<>();
    if (number == 0) {
      digits.add(0);
    } else {
      while (number != 0) {
        int digit = number % 10;
        digits.add(0, digit);
        number /= 10;
      }
    }

    return digits;
  }

  public static int[] getDigitsA(int number) {
    int temp = number;
    int count = 0;
    while (temp != 0) {
      temp /= 10;
      count++;
    }

    int[] digits = new int[count];

    for (int i = count - 1; i >= 0; i--) {
      digits[i] = number % 10;
      number /= 10;
    }

    return digits;
  }

  public static int getNumber(List<Integer> digits) {
    int number = 0;
    for (int digit : digits) {
      number = number * 10 + digit;
    }

    return number;
  }

  public static int getNumber(int[] digits) {
    int number = 0;
    for (int digit : digits) {
      number = number * 10 + digit;
    }

    return number;
  }

  public static void main(String[] args) {
    int number = 12345;

    // Get the digits of the number as a list
    List<Integer> digitsList = getDigits(number);
    System.out.println(digitsList); // [1, 2, 3, 4, 5]

    // Get the digits of the number as an array
    int[] digitsArray = getDigitsA(number);
    System.out.println(Arrays.toString(digitsArray)); // [1, 2, 3, 4, 5]

    // Create a number from the list of digits
    int newNumber = getNumber(digitsList);
    System.out.println(newNumber); // 12345

    // Create a number from the array of digits
    int newNumberA = getNumber(digitsArray);
    System.out.println(newNumberA); // 12345
  }
}
