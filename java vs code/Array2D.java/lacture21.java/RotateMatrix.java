import java.util.Scanner;

public class RotateMatrix {

    static void printMartrix(int[][] Matrix) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix.length; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

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


    static void reverseArray(int [] arr){
        int i=0 , j= arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
    }

    static void rotate(int[][] Matrix , int n){
        // transpose
        TransposeInPlace(Matrix, n, n);

        // reverse each row of transposed Matrix
        for(int i=0; i<n; i++){
            reverseArray(Matrix[i]);
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

        rotate(Matrix, r);
        System.out.println("rotate matrix is : ");
        printMartrix(Matrix);
    }
}
