import java.util.Scanner;

public class PrintSpiral {

    static void PrintMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void PrintSpiralOrder(int[][] matrix, int r, int c) {

        int toprow = 0, bottomrow = r - 1, leftcol = 0, rightcol = c - 1;
        int totalElement = 0;
        while (totalElement < r * c) {

            // toprow -> leftcol to rightcol
            for (int j = leftcol; j <= rightcol && totalElement < r * c; j++) {
                System.out.print(matrix[toprow][j] + " ");
                totalElement++;
            }
            toprow++;

            // rightcol -> toprow to bottomrow
            for (int i = toprow; i <= bottomrow && totalElement < r * c; i++) {
                System.out.print(matrix[i][rightcol] + " ");
                totalElement++;

            }
            rightcol--;
            // bottomrow -> rightcol to leftcol
            for (int j = rightcol; j >= leftcol && totalElement < r * c; j--) {
                System.out.print(matrix[bottomrow][j] + " ");
                totalElement++;

            }
            bottomrow--;
            // leftcol -> bottomrow to toprow
            for (int i = bottomrow; i >= toprow && totalElement < r * c; i--) {
                System.out.print(matrix[i][leftcol] + " ");
                totalElement++;

            }
            leftcol++;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row : ");
        int r = sc.nextInt();
        System.out.println("enter columns: ");
        int c = sc.nextInt();

        System.out.println("enter " + (r * c) + " element");

        int arr[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input matrix is: ");

        PrintMatrix(arr);

        System.out.println("spiral order is: ");
        PrintSpiralOrder(arr, r, c);

    }

}
