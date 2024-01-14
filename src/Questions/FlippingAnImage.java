package Questions;
// https://leetcode.com/problems/flipping-an-image/
import java.util.Arrays;

public class FlippingAnImage {

    static  int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;

        int[][] newImage = invert(reverse(image));
        return newImage;

    }

    static void swap(int[][] arr, int row, int col1, int col2) {
        int temp = arr[row][col1];
        arr[row][col1] = arr[row][col2];
        arr[row][col2] = temp;
    }

    static int[][] reverse(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                swap(matrix, i, j, m - j - 1);
            }
        }
//        System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }

    static int[][] invert(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;

        for(int i =0; i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0){
                    mat[i][j] = 1;
                } else {
                    mat[i][j]=0;
                }
            }
        }
        return mat;
    }

  public static void main(String[] args) {
    int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
    System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
  }
}
