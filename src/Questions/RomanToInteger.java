package Questions;

// https://leetcode.com/problems/roman-to-integer/description/
import java.util.*;

public class RomanToInteger {
  static int romanToInt(String s) {
    Map<String, Integer> map = new HashMap<>();
    map.put("I", 1);
    map.put("V", 5);
    map.put("X", 10);
    map.put("L", 50);
    map.put("C", 100);
    map.put("D", 500);
    map.put("M", 1000);
    map.put("IV", 4);
    map.put("IX", 9);
    map.put("XL", 40);
    map.put("XC", 90);
    map.put("CD", 400);
    map.put("CM", 900);
    int sum = 0;

    for (int i = 0; i < s.length(); i++) {

      if (i < s.length() - 1 && map.containsKey(s.substring(i, i + 2))) {
        sum = sum + map.get(s.substring(i, i + 2));
        i++;
      } else {
        sum = sum + map.get(String.valueOf(s.charAt(i)));
      }
    }

    return sum;
  }

  public static void main(String[] args) {
    String s = "MCMXCIV";
    System.out.println(romanToInt(s));
  }
}
