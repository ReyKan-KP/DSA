package Questions;
//https://leetcode.com/problems/find-words-containing-character/
import java.util.*;

public class FindWordsContainingCharacter {
  static List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> list =new ArrayList<>();
    for(int i = 0;i<words.length;i++){
      if(words[i].contains(String.valueOf(x))){
        list.add(i);
      }
    }
    return list;
  }

  public static void main(String[] args) {
    String[] words = {"leetcode","abc","xyz","aeiou"};
    char x = 'e';
    System.out.println(findWordsContaining(words,x));
  }
}
