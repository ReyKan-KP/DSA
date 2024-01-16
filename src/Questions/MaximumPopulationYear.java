package Questions;

import java.util.Arrays;

public class MaximumPopulationYear {
//    static int maximumPopulation(int[][] logs) {
//         int rows = logs.length;
//         int cols = logs[0].length;
//         int[] arr = new int[cols];

//         int x = 0;
//         for (int j = 0; j < cols; j++) {
//             arr[j] = logs[1][j] - logs[j][0] - 1;
//         System.out.println(Arrays.toString(arr));

//         }
//         int min = arr[0];
//         for (int i = 0; i < cols; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         for (int i = 0; i < cols; i++) {
//             if (min==arr[i]) {
//                 x =logs[0][i];
//             }
//         }
//         System.out.print(min);

//         return x;

//     }
    static int maximumPopulation(int[][] logs) {
        int minYear = Integer.MAX_VALUE;
        int maxYear = Integer.MIN_VALUE;

        for (int[] log : logs) {
            minYear = Math.min(minYear, log[0]);
            maxYear = Math.max(maxYear, log[1]);
        }

        int[] population = new int[maxYear - minYear + 1];

        for (int[] log : logs) {
            for (int year = log[0]; year < log[1]; year++) {
                population[year - minYear]++;
            }
        }

        int maxPopulation = 0;
        int result = 0;

        for (int year = minYear; year <= maxYear; year++) {
            if (population[year - minYear] > maxPopulation) {
                maxPopulation = population[year - minYear];
                result = year;
            }
        }

//        System.out.println(Arrays.toString(population));
//        System.out.println(maxPopulation);

        return result;
    }

  public static void main(String[] args) {
    int[][] arr = {{1993,1999},{2000,2010}};
    System.out.println(maximumPopulation(arr));
  }
}
