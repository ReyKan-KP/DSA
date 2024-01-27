package Questions;

import java.util.*;

public class SplitTwoStringsToMakePalindrome {
    static  boolean checkPalindromeFormation(String a, String b) {
        return checkPalindrome(a, b) || checkPalindrome(b, a);
    }

   static boolean checkPalindrome(String a, String b) {
        int start = 0;
        int end = a.length() - 1;

        while (start < end) {
            if (a.charAt(start) != b.charAt(end)) {
                break;
            }
            start++;
            end--;
        }

        return isPalindrome(a, start, end) || isPalindrome(b, start, end);
    }

    static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

// class Solution {
//     public boolean checkPalindromeFormation(String a, String b) {
//         String s = new String(a+b);
//         int start =0;
//         int end = s.length()-1;
//         int count = 0;

//         if(a.length()==1){
//             return true;
//         }
//         int i =1;

//             int mid1 = start + (end-start)/2;
//             int mid2 = mid1 + 1;
//         while(start<end){
//             if(s.charAt(start)==s.charAt(end)){
//                 count++;
//                 start ++;
//                 end--;
//             }else if(s.charAt(mid1)==s.charAt(mid2)){
//                 count ++;
//                 mid1--;
//                 mid2 ++;
//                 // break;
//             }
//             else{
//                 break;
//             }
//         }
//         if(count>1){
//             return true;
//         }
//         return false;

//     }
// }


public static void main(String[] args) {
    String a = "ulacfd";
    String b = "jizalu";
    System.out.println(checkPalindromeFormation(a, b));
}
}
