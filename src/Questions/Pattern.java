package Questions;
// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class Pattern {

    // How to approach a pattern problem?
        // 1. no. of lines = no. of rows=no. of times loop will run
        // 2. identify for every row no,
            //2.1 how many columns are there
            //2.2 type of elements in each column
        // 3. what do you need to print
        // 4. what is the relation(formula) between the rows and columns




    static void pattern1(int n){
//        *****
//        *****
//        *****
//        *****
//        *****
        for (int row =1;row <=n; row++){
            // for every row, run the col
            for(int col=1; col<=n; col++){
                System.out.print("* ");
            }
            // when one row is printed, move to next line
            System.out.println();
        }
    }
    static void pattern2(int n){
//        *
//        **
//        ***
//        ****
//        *****

        for(int row =1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
//        *****
//        ****
//        ***
//        **
//        *
        for (int rows =1;rows<=n;rows++){
            for(int cols=n;cols>=rows;cols--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
        for(int row =1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
//        pattern2(n);
//        pattern3(n-1);
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


  public static void main(String[] args) {
    pattern1(5);
    pattern2(5);
    pattern3(5);
    pattern4(5);
    pattern5(5);
    pattern28(5);

  }
}
