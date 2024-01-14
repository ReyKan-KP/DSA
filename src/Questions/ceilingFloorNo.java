package Questions;

public class ceilingFloorNo {

  static void binarySearchCeilingFloor(int[] arr, int target) {
    int startIndex = 0;
    int endIndex = arr.length - 1;
    int middleIndex;

    boolean isAsc = (arr[startIndex] < arr[endIndex]);

    while (startIndex <= endIndex) {
      middleIndex = startIndex + (endIndex - startIndex) / 2;

      if (arr[middleIndex] == target) {
        System.out.println("Element is at " + middleIndex + " index");
        break;
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
    System.out.println("Ceiling No of target is " + arr[startIndex]);
    System.out.println("Floor No of target is " + arr[endIndex]);
  }

  public static void main(String[] args) {
    int[] arr = {2, 3, 5, 9, 14, 16, 18};
    binarySearchCeilingFloor(arr, 15);
  }
}
