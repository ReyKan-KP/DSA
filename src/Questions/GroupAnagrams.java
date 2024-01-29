package Questions;

// https://leetcode.com/problems/group-anagrams/
import java.util.*;

public class GroupAnagrams {

  static boolean areAnagrams(String str1, String str2) {
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    return Arrays.equals(charArray1, charArray2);
  }

  static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> anagramMap = new HashMap<>();

    for (String str : strs) {
      char[] charArray = str.toCharArray();
      Arrays.sort(charArray);
      String sortedStr = new String(charArray);
      anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
    }
    return new ArrayList<>(anagramMap.values());
  }

  public static void main(String[] args) {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    System.out.println(groupAnagrams(strs));
  }
}
