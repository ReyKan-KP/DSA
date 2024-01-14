import java.util.Arrays;

public class insertionSort {
    static int swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return 0;
    }

    static void insertionSortAlgo(int[] arr){
        int n = arr.length;
        int i;
        for (i = 1; i < n -1; i++) {
           for(int j = i+1;j>0;j--){
               if(arr[j]<arr[j-1]){
                   swap(arr,j,j-1);
               }else{
                   break;
               }
           }
        }
    }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, -1, -2, -3, -4, -5 };
    insertionSortAlgo(arr);
    System.out.println(Arrays.toString(arr));
  }
}
