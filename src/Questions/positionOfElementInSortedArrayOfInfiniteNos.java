package Questions;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class positionOfElementInSortedArrayOfInfiniteNos {

  static int findRange(int[] arr, int target) {
    int startIndex = 0;
    int endIndex = 1;

    while (target > arr[endIndex]) {
      int newStartIndex = endIndex + 1;
      endIndex = endIndex + (endIndex - startIndex + 1) * 2;
      startIndex = newStartIndex;
    }
    return binarySearch(arr, target, startIndex, endIndex);
  }

  static int binarySearch(int[] arr, int target, int startIndex, int endIndex) {

    while (startIndex <= endIndex) {
      int middleIndex = startIndex + (endIndex - startIndex) / 2;

      if (target > arr[middleIndex]) {
        startIndex = middleIndex + 1;
      } else if (target < arr[middleIndex]) {
        endIndex = middleIndex - 1;
      } else {
        return middleIndex;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = new int[] {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
    System.out.println(findRange(arr, 10));
  }
}
