package Questions;
// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class searchInRotatedSortedArray {
  static int search(int[] nums, int target) {
    int pivotIndex = findPivot(nums);

    if (pivotIndex == -1) {
      return binarySearch(nums, target, 0, nums.length - 1);
    }
    if (nums[pivotIndex] == target) {
      return pivotIndex;
    }
    if (target >= nums[0]) {
      return binarySearch(nums, target, 0, pivotIndex - 1);
    }
    return binarySearch(nums, target, pivotIndex + 1, nums.length - 1);
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

  static int findPivot(int[] arr) {
    int startIndex = 0;
    int endIndex = arr.length - 1;
    while (startIndex <= endIndex) {
      int middleIndex = startIndex + (endIndex - startIndex) / 2;

      if (middleIndex < endIndex && arr[middleIndex] > arr[middleIndex + 1]) {
        return middleIndex;
      }
      if (middleIndex > startIndex && arr[middleIndex] < arr[middleIndex - 1]) {
        return middleIndex - 1;
      }
      if (arr[middleIndex] <= arr[startIndex]) {
        endIndex = middleIndex - 1;
      } else {
        startIndex = middleIndex + 1;
      }
    }
    return -1;
  }

  static int findPivotWithDuplicates(int[] arr) {
    int startIndex = 0;
    int endIndex = arr.length - 1;
    while (startIndex <= endIndex) {
      int middleIndex = startIndex + (endIndex - startIndex) / 2;

      if (middleIndex < endIndex && arr[middleIndex] > arr[middleIndex + 1]) {
        return middleIndex;
      }
      if (middleIndex > startIndex && arr[middleIndex] < arr[middleIndex - 1]) {
        return middleIndex - 1;
      }
      if (arr[middleIndex] == arr[startIndex] && arr[middleIndex]== arr[endIndex]) {
        if (arr[startIndex]>arr[startIndex+1]){
          return startIndex;
        }
        startIndex++;
        if (arr[endIndex]<arr[endIndex-1]){
          return endIndex-1;
        }
        endIndex--;
      }
      else if (arr[startIndex]<arr[middleIndex]|| (arr[startIndex]==arr[middleIndex]&&arr[middleIndex]>arr[endIndex])){
       startIndex=middleIndex+1;
      }
      else{
      endIndex = middleIndex-1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    int[] numsDuplicate = {2,6,2,2,2};
    System.out.println(findPivot(nums));
    System.out.println(findPivotWithDuplicates(numsDuplicate));
    System.out.println(search(nums,6));
  }
}
