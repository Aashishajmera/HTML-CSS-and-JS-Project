import java.util.Scanner;

public class TransposeMatrix {

    static void printMartrix(int[][] Matrix) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix.length; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findMatrix(int[][] Matrix, int r, int c) {
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = Matrix[j][i];
            }
        }
        return ans;
    }

    /*
     * ishe ham bina kisi second matrix ke bhi bna sakte the jese niche ek or
     * mathord bnai
     */

    static void TransposeInPlace(int[][] Matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                // swap matrix [i][j] , matrix [j][i]
                int temp = Matrix[i][j];
                Matrix[i][j] = Matrix[j][i];
                Matrix[j][i] = temp;

            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int r = sc.nextInt();
        System.out.println("Enter column number:");
        int c = sc.nextInt();

        int[][] Matrix = new int[r][c];
        int totalElement = r * c;

        System.out.println("enter " + totalElement + " value:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix:");
        printMartrix(Matrix);

        // System.out.println("Transpose of Matrix: ");
        // int [][] ans= findMatrix(Matrix, r, c);
        // printMartrix(ans);

        System.out.println("Transpose of Matrix: ");
        TransposeInPlace(Matrix, r, c);
        printMartrix(Matrix);

    }
}
