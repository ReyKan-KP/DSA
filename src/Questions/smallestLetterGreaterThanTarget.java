package Questions;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class smallestLetterGreaterThanTarget {
    static char nextGreatestLetter(char[] letters, char target) {
        int startIndex = 0;
        int endIndex = letters.length - 1;

        while (startIndex <= endIndex) {
          int middleIndex = startIndex + (endIndex - startIndex) / 2;

                if (target < letters[middleIndex]) {
                    endIndex = middleIndex - 1;
                } else {
                    startIndex = middleIndex + 1;
                }
        }
//        System.out.println("Ceiling No of target is " + letters[startIndex]);
        return letters[startIndex % letters.length];
    }
  public static void main(String[] args) {

      char[] letters = {'c','f','j'};
    System.out.println(nextGreatestLetter(letters, 'c'));

  }
}
