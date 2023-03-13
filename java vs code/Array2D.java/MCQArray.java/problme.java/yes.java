import java.util.Scanner;

public class yes {

    static void PrintArray(int[] arr) {

        Scanner sc = new Scanner(System.in);

        System.out.println("check number: ");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("yes");
                return;
            }

        }
        System.out.println("no");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " Element:");

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        PrintArray(arr);

    }
}
