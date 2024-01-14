import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayArrayList {
  static Scanner sc = new Scanner(System.in);

  static void Arrays1D() {
    /* datatype[] var_name = new datatype[length] */
    int[] arr = new int[5];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    for (int j : arr) {
      System.out.print(j + " ");
    }
    System.out.println(Arrays.toString(arr));
  }

  static void ArraysMultiD() {
    //		int[][] arr2=
    //				{
    //				{1,2,3},
    //				{4,5,6},
    //				{7,8,8}
    //				};
    int[][] arr = new int[3][3];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) { // Corrected loop condition here
        arr[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(Arrays.toString(arr[i]));
    }
  }

  static void ArrayList1D() {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(23);
    list.add(283);
    list.add(239);
    list.add(233);
    list.add(223);
    list.add(123);
    list.add(273);
    System.out.println(list);
    list.set(4, 545);
    System.out.println(list);

    for (int i = 0; i < 10; i++) {
      list.add(sc.nextInt());
    }
    //		System.out.println(list);
    for (int i = 0; i < 10; i++) {
      System.out.println(list.get(i));
    }
  }

  static void ArraysListMultiD() {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    // initialisation
    for (int i = 0; i < 3; i++) {
      list.add(new ArrayList<>());
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        list.get(i).add(sc.nextInt());
      }
    }
    System.out.println(list);
  }

  static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }

  static void max(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    //    for (int i = 0; i < arr.length; i++) {
    //		if(arr[i]>=arr[i+1]){
    //        System.out.println(arr[i]);
    //		}
    //		else if(arr[i]<arr[i+1]){
    //			System.out.println(arr[i+1]);
    //		}
    //
    //	}
    //		int max = arr[0];
    System.out.println(max);
  }

  static void reverse(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      swap(arr, start, end);
      start++;
      end--;
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {
    //		System.out.println ("Hello world!");
//    		Arrays1D ();
//    		ArraysMultiD();
//     ArrayList1D ();
//    		ArraysListMultiD();
    int[] arr = {1, 3, 5, 4, 7, 2, 9};
    		swap(arr,5,0);
        System.out.println(Arrays.toString(arr));
    max(arr);
    		reverse(arr);
  }
}
