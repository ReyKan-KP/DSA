public class binarySearchAlgo {

  static int binarySearchOrderAgnostic(int[] arr, int target) {
    int startIndex = 0;
    int endIndex = arr.length - 1;

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

  static int binarySearch(int[] arr, int target) {
    int startIndex = 0;
    int endIndex = arr.length - 1;

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
    int[] arr = {-343, 1, 2, 3, 4, 5, 6, 7, 8, 9, 54};
    int[] arrDes = {32323, 2342, 453, 54, 32, 2, -32, -534, -5462};
    System.out.println(binarySearch(arr, 8));
    System.out.println(binarySearchOrderAgnostic(arrDes, 2));
  }
}
