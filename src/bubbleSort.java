import java.util.Arrays;

public class bubbleSort {

    static int swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return 0;
    }
    static void bubbleSortAlgo(int[] arr){
        int n = arr.length;
        int i;
        boolean swapped;

    for (i = 0; i < n; i++) {
      swapped = false;
      for (int j = 1; j < n; j++) {
        if (arr[j] < arr[j - 1]) {
          swap(arr, j, j - 1);
          swapped = true;
        }
      }
    if (!swapped)
        break;
    }

    }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, -1, -2, -3, -4, -5 };
    bubbleSortAlgo(arr);
    System.out.println(Arrays.toString(arr));
  }
}
