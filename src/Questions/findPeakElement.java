package Questions;
// https://leetcode.com/problems/find-peak-element/submissions/

public class findPeakElement {

    static int peakIndexInMountainArray(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex < endIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (arr[middleIndex] > arr[middleIndex + 1]) {
                endIndex = middleIndex;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return startIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
