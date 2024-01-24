package Questions;
//https://leetcode.com/problems/reverse-string/
import java.util.*;

public class ReverseString {
    static void reverseString(char[] s) {
        int n =s.length;
        int j = n -1;
        int i = 0;

        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

  public static void main(String[] args) {
    char[] s = {'h','e','l','l','o'};
    reverseString(s);
    System.out.println(Arrays.toString(s));
  }
}
