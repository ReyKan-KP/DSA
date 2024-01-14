import java.util.Arrays;

public class selectionSort {

  static int getMaxIndex(int[] arr, int start, int end) {
    int max = start;
    for (int i = start; i <= end; i++) {
      if (arr[i] > arr[max]) {
        max = i;
      }
    }
    return max;
  }
  static int swap(int[] arr, int first, int second) {
    int temp = arr[second];
    arr[second] = arr[first];
    arr[first] = temp;
    return 0;
  }


  static void selectionSortAlgo(int[] arr) {
    int n = arr.length;
    int i;
    for (i = 0; i < n - 1; i++) {
      int last = arr.length-i-1;
      int maxIndex = getMaxIndex(arr, 0, last);
      swap(arr, maxIndex, last);

    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, -1, -2, -3, -4, -5 };
    selectionSortAlgo(arr);
    System.out.println(Arrays.toString(arr));
  }
}
