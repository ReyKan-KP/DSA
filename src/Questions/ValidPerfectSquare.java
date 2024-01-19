package Questions;

public class ValidPerfectSquare {

    static boolean isPerfectSquare(int num) {
        if (num <= 1) {
            return true;
        }
        long start = 1;
        long end = num;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }

  public static void main(String[] args) {
    System.out.println(isPerfectSquare(16));
  }
}
