public class Recursion {

  public static void main(String[] args) {
//    print(1);
//    System.out.println(fibonacci(8));
//    System.out.println(factorial(4));
    int[] arr = {1,2,3,4,5,6,7,8,9};
    System.out.println(binarySearch(arr,5,0,arr.length-1));

  }

  static void print(int n){
    //base case
    if (n == 6) {
      return;
    }
    //body
    System.out.println(n);
    //recursive case
    print(n+1);
  }
  static int fibonacci(int n){
    if(n < 2){
      return n;
    }
    return fibonacci(n-1)+fibonacci(n-2);
  }
  static int factorial(int n){
    if(n == 1){
      return 1;
    }
    return n * factorial(n-1);
  }
  static int binarySearch(int[] arr,int target,int s,int e){
    if (s>e){
      return -1;
    }
    int m = s+(e-s)/2;
    if (arr[m] == target){
      return m;
    }
    if (target<arr[m]){
      return binarySearch(arr,target,s,m-1);
    }
      return binarySearch(arr,target,s+1,m);
  }
}
