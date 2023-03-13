import java.util.Scanner;

public class PascalTrangle {

    static void printMartrix(int[][] Matrix) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n) {
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            /*
             * i th row has i+1 columns
             * 
             * ans[0] = new int [1]
             * ans[1]= new int [2]
             */

            ans[i] = new int[i + 1];      // number of cols in ith row = i+1;

            /*
             * 1st and last element of every row is 1
             */

            ans[i][0] = ans[i][i] =1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j-1];
            }

        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();

        int [][] ans = pascal(n);
        printMartrix(ans);

    }

}