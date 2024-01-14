import java.util.Arrays;

public class binarySearchIn2dArray {

    static int[] binarySearchIn2dArray(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return new int[] {row, col};
            }

            if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[] {-1, -1};
    }
    static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cStart = mid+1;
            }else{
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] binarySearchIn2SortedArray(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length - 1;
        if (row == 1) {
            return binarySearch(matrix, 0, 0, col, target);
        }
        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[] {mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        if (matrix[rStart][cMid] == target) {
            return new int[] {rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] {rStart + 1, cMid};
        }
        //1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        //2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col]) {
            return binarySearch(matrix, rStart, cMid + 1, col, target);
        }
        //3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        //4th half
        if (target >= matrix[rStart + 1][cMid + 1] && target <= matrix[rStart + 1][col]) {
            return binarySearch(matrix, rStart + 1, cMid + 1, col, target);
        }
        return new int[] {-1, -1};
    }

  public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 34;
        int[] ans = binarySearchIn2dArray(matrix, target);
        int[] ans2 = binarySearchIn2SortedArray(matrix, target);
    System.out.println(Arrays.toString(ans));
    System.out.println(Arrays.toString(ans2));
  }
}
