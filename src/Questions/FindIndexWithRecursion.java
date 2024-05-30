package Questions;

import java.util.ArrayList;

public class FindIndexWithRecursion {
  //  static ArrayList<Integer> list = new ArrayList<>();

  static int findIndex(int[] arr, int target, int i) {
    if (i == arr.length) {
      return -1;
    }
    if (arr[i] == target) {
      return i;
    }
    return findIndex(arr, target, i + 1);
  }

  //  static ArrayList<Integer> findAllIndex(int[] arr, int target, int i) {
  //    if (i == arr.length) {
  //      return null;
  //    }
  //    if (arr[i] == target) {
  //      list.add(i);
  //    }
  //    findAllIndex(arr, target, i + 1);
  //    return null;
  //  }

  static ArrayList<Integer> findAllIndex2(int[] arr, int target, int i) {
    ArrayList<Integer> list = new ArrayList<>();
    if (i == arr.length) {
      return list;
    }
    if (arr[i] == target) {
      list.add(i);
    }
    ArrayList<Integer> allAnswer = findAllIndex2(arr, target, i + 1);
    list.addAll(allAnswer);
    return list;
  }

  public static void main(String[] args) {
    int[] arr = {45, 23, 45, 45, 78, 88};
    int target = 45;
    System.out.println(findIndex(arr, target, 0));
    System.out.println(findAllIndex2(arr, target, 0));
  }
}
