package Questions;

// https://leetcode.com/problems/group-anagrams/
import java.util.*;

public class GroupAnagrams {

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
