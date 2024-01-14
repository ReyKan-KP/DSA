package Questions;
// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class findTheRotationCountInRotatedSortedArray {

    static int countRotations(int[] arr){

        return findPivot(arr)+1;

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

    public static void main(String[] args) {
      int[] arr = { 15, 18, 2, 3, 6, 12 };
      System.out.println(countRotations(arr));
  }
}
