package Questions;
//https://leetcode.com/problems/missing-number/description/
public class missingNumber {
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int missingNumber(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int index = 0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }

  public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
    System.out.println(missingNumber(arr));
  }
}
