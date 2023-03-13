
import java.util.Scanner;

public class printSpiralSqure {

    static void PrintMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int n) {

        int[][] matrix = new int[n][n];
        int toprow = 0, bottomrow = n - 1, leftcol = 0, rightcol = n- 1;
        int curr = 1;
        while (curr <= n * n) {

            // toprow -> leftcol to rightcol
            for (int j = leftcol; j <= rightcol && curr <= n * n; j++) {
                matrix[toprow][j] = curr;
                curr++;
            }
            toprow++;

            // rightcol -> toprow to bottomrow
            for (int i = toprow; i <= bottomrow && curr <= n * n; i++) {
                matrix[i][rightcol] = curr;
                curr++;

            }
            rightcol--;
            // bottomrow -> rightcol to leftcol
            for (int j = rightcol; j >= leftcol && curr <= n * n; j--) {
                matrix[bottomrow][j] = curr++;

            }
            bottomrow--;
            // leftcol -> bottomrow to toprow
            for (int i = bottomrow; i >= toprow && curr <= n * n; i--) {
                matrix[i][leftcol] = curr++;

            }
            leftcol++;
        }
            return matrix;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        int[][] matrix = generateSpiralMatrix(n);
        PrintMatrix(matrix);

    }

}
