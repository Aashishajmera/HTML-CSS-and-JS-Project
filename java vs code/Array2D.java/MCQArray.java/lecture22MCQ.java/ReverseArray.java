import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row:");
        int r = sc.nextInt();
        System.out.println("enter column:");
        int c = sc.nextInt();

        System.out.println("enter " + r * c + " element:");

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.println("print array: ");

        for (int i = 0; i < r; i++) {
            for (int j = c-1; j >=0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }


    }

}
