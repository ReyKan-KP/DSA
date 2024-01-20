// Bitwise Operations Observations

// Original Value: 110010100

//// AND Operation
//110010100 & 111111111 = 110010100 (No change)
//   a & 1 = a
//
//// OR Operation
//    110010100 | 000000001 = 110010101
//
//// XOR Operation
//    110010100 ^ 111111111 = 001101011 (Flipped)
//   a ^ 1 = ~a
//
//// Left Shift Operation
//    110010100 << 1 = 1100101000 (Shifted left by 1)
//    a << b = a * 2^b  (b=1)
//
//// Right Shift Operation
//    110010100 >> 1 = 11001010 (Shifted right by 1)
//    a >> b = a / 2^b  (b=1)
//
//// Unsigned Right Shift Operation
//    110010100 >>> 1 = 011001010  (Shifted right by 1)
//
//// NOT Operation
//    ~110010100 = 001101011 (Flipped)
//
//// AND with 000000001
//    110010100 & 000000001 = 000000000
//
//// OR with 000000001
//    110010100 | 000000001 = 110010101
//
//// XOR with 000000001
//    110010100 ^ 000000001 = 110010101
public class BitwiseOperators {

  static void OddOrEven(int n){
//    if(n%2==0){
//      System.out.println("Even");
//    }else {
//      System.out.println("Odd");
//    }
    if((n&1) == 1){
      System.out.println("Odd");
    }else {
      System.out.println("Even");
    }
  }
  static int findUnique(int[] arr){
    int unique =0;

    for (int n:arr){
      unique ^= n;
    }
    return unique;
  }
  static int iThBit(int n,int i){
    // mask = 1<<(n-1)
    // n & mask
    return n & (1<<(i-1));
  }
  static int setIthBit(int n,int i){
    // mask = 1<<(n-1)
    // n | mask
    return n | (1<<(i-1));
  }
static int resetIthBit(int n,int i){
    // mask = 1<<(n-1)
    // n & ~mask
    return n & ~(1<<(i-1));
  }
  static int rightMostSetBit(int n){
    // mask = 1<<(n-1)
    // n & ~mask
    return n & -n;
  }
  static int negative(int n){
    return ~n+1;
  }
  public static void main(String[] args) {
    OddOrEven(7);
    int[] arr = {1,2,3,3,2,1,5,6,7,5,6};
    System.out.println(findUnique(arr));
    System.out.println(iThBit(6,2));
    System.out.println(setIthBit(6,2));
    System.out.println(resetIthBit(6,2));
    System.out.println(rightMostSetBit(6));
    System.out.println(negative(-6));
  }
}
