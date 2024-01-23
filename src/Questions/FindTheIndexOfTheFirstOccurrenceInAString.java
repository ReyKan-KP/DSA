package Questions;
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
import java.util.*;

public class FindTheIndexOfTheFirstOccurrenceInAString {
  static int strStr(String haystack, String needle) {
    return (haystack.indexOf(needle));
  }

  public static void main(String[] args) {
    String haystack = "hello";
    String needle = "ll";
    System.out.println(strStr(haystack, needle));
  }
}
