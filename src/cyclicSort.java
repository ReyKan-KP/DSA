import java.util.Arrays;

public class cyclicSort {

    static int swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return 0;
    }

    static void cyclicSortAlgo(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }

  public static void main(String[] args) {
    int[] arr = { 3,5,2,1,4};
    cyclicSortAlgo(arr);
    System.out.println(Arrays.toString(arr));
  }
}
