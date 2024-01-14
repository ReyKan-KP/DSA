package Questions;

// https://leetcode.com/problems/find-in-mountain-array/description/
public class findInMountainArray {

  static int findInMountainArray1(int[] arr, int target) {
    int peak = peakIndexInMountainArray(arr);
    int firstTry = binarySearch(arr, target, 0, peak);
    if (firstTry != -1) {
      return firstTry;
    }
    return binarySearch(arr, target, peak + 1, arr.length - 1);
  }

  static int peakIndexInMountainArray(int[] arr) {
    int startIndex = 0;
    int endIndex = arr.length - 1;

    while (startIndex < endIndex) {
      int middleIndex = startIndex + (endIndex - startIndex) / 2;
      if (arr[middleIndex] > arr[middleIndex + 1]) {
        endIndex = middleIndex;
      } else {
        startIndex = middleIndex + 1;
      }
    }
    return startIndex;
  }

  static int binarySearch(int[] arr, int target, int startIndex, int endIndex) {
    boolean isAsc = (arr[startIndex] < arr[endIndex]);

    while (startIndex <= endIndex) {
      int middleIndex = startIndex + (endIndex - startIndex) / 2;

      if (arr[middleIndex] == target) {
        return middleIndex;
      }
      if (isAsc) {
        if (target > arr[middleIndex]) {
          startIndex = middleIndex + 1;
        } else if (target < arr[middleIndex]) {
          endIndex = middleIndex - 1;
        }
      } else {
        if (target < arr[middleIndex]) {
          startIndex = middleIndex + 1;
        } else if (target > arr[middleIndex]) {
          endIndex = middleIndex - 1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 3, 1};
    System.out.println(findInMountainArray1(arr, 3));
  }
}
