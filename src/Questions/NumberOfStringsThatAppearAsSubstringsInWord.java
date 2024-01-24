package Questions;
//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
import java.util.*;

public class NumberOfStringsThatAppearAsSubstringsInWord {

  static int numOfStrings(String[] patterns, String word) {
    int count =0;
    int n = patterns.length;
    for(int i =0;i<n;i++){
      if(word.contains(patterns[i])){
        count ++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    String[] patterns = {"a","abc","bc","d"};
    String word = "abc";
    System.out.println(numOfStrings(patterns, word));
  }
}
