package Questions;

// https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/
import java.util.*;

public class LeastNumberOfUniqueIntegersAfterKRemovals {
  static int findLeastNumOfUniqueInts(int[] arr, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }

    List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
    sortedEntries.sort(Map.Entry.comparingByValue());

    int count = 0;
    int remainingSum = k;

    for (Map.Entry<Integer, Integer> entry : sortedEntries) {
      int occurrences = entry.getValue();
      if (remainingSum >= occurrences) {
        remainingSum -= occurrences;
        count++;
      } else {
        break;
      }
    }
    return map.size() - count;
  }

  public static void main(String[] args) {
    int[] arr = {4, 3, 1, 1, 3, 3, 2};
    int k = 3;
    System.out.println(findLeastNumOfUniqueInts(arr, k));
  }
}
