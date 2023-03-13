import java.util.Scanner;

public class MCQ {

    static void PrintArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

    static void ReverseArray(int[][] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {            

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int r = sc.nextInt();
        System.out.println("enter columns ");
        int c = sc.nextInt();

        System.out.println("enter " + r * c + " element");

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("real matrix is:");
        PrintArray(arr);
        System.out.println("Revrse matrix is:");
        ReverseArray(arr);

    }
}
