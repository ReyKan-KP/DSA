import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
  static Scanner sc = new Scanner(System.in);

  static void search(int[] arr, int target) {
    int i;
    int b = 0;
    if (arr.length == 0) {
      System.out.println("Array is Empty");
    }
    for (i = 0; i < arr.length; i++) {
      if (target == arr[i]) {
        b = 1;
        break;
      }
    }
    if (b == 1) {
      System.out.println(target + " exists at index " + i);
    } else {
      System.out.println(target + " don't exists");
    }
  }

  static boolean search(String str, char target) {
    if (str.length() == 0) {
      System.out.println("String is Empty");
      return false;
    }
    for (int i = 0; i < str.length(); i++) {
      if (target == str.charAt(i)) {
        return true;
      }
    }
    return false;
  }

  static void min(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println(min);
  }

  static int[] searchIn2DArray(int[][] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == target) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {-1, -1};
  }

  static void maxIn2D(int[][] arr) {
    int max = arr[0][0];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] > max) {
          max = arr[i][j];
        }
      }
    }
    System.out.println(max);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {12, -56, 3, 23, 76, 2, 87, 21};
    //    String str = "Hello World";
    int[][] arr2D = {
      {1, 2, 34, 57},
      {65, 23, 54, 365},
      {-1, 43, 76, 32}
    };
    //     int a = sc.nextInt();
    //     search(arr, a);

    //    char b = sc.next().charAt(0);
    //    if (search(str, b)) {
    //        System.out.println("Character found in the string.");
    //    } else {
    //        System.out.println("Character not found in the string.");
    //    }

    min(arr);

    //    int c = sc.nextInt();
    //   int[] ans = searchIn2DArray(arr2D,c);
    //    System.out.println(Arrays.toString(ans));
    maxIn2D(arr2D);
  }
}
