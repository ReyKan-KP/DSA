package Questions;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class CheckIfTheSentenceIsPangram {
    static boolean checkIfPangram(String s) {
        int n = s.length();
        int count =0;
        String alphabet ="qwertyuiopasdfghjklzxcvbnm";


        for(int i =0;i<alphabet.length();i++){
            if(s.contains(String.valueOf(alphabet.charAt(i)))){
                count++;
            }
        }
        return count >= 26;

    }

  public static void main(String[] args) {
    String str = "thequickbrownfoxjumpsoverthelazydog";
    System.out.println(checkIfPangram(str));
  }
}
