package Questions;
// https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {

    static boolean isPalindrome(String s) {

        String str = s.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");

//        System.out.print(str);

        int p = 0;
        int q = str.length() - 1;
        while (p < q) {
            if (str.charAt(p) == str.charAt(q)) {
                p++;
                q--;
            } else {
                return false;
            }
        }
        return true;

    }

  public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s2 = "A bc cba";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s2));
  }
}
