package Questions;

public class checkArrayIsSortedWithRecursion {
  static boolean checkArrayIsSorted(int[] arr, int n) {
    if (n == arr.length - 1) {
      return true;
    }
    return (arr[n] < arr[n + 1] && checkArrayIsSorted(arr, n + 1));
  }

  public static void main(String[] args) {
    int[] arr = {20, 23, 24, 45, 78, 88};
    System.out.println(checkArrayIsSorted(arr, 0));
  }
}
