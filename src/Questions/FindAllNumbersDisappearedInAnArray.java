package Questions;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class FindAllNumbersDisappearedInAnArray {
  static void swap(int[] arr,int first,int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }

  static List<Integer> findDisappearedNumbers(int[] arr){
    int i =0;
    List<Integer> nums = new ArrayList<>();
    while(i<arr.length){
      int correct = arr[i]-1;
      if (arr[i] != arr[correct]) {
        swap(arr,i,correct);
      }else{
        i++;
      }
    }
    for(int index = 0;index<arr.length;index++){
      if(arr[index]!=index+1){
        nums.add(index+1);
      }
    }
    return nums;
  }

  public static void main(String[] args) {
    int arr[] = {4,3,2,7,8,2,3,1};
    System.out.println(findDisappearedNumbers(arr));
  }
}
