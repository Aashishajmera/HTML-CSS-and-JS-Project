import java.util.Scanner;

public class ReverseArray {



    static void reverse(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter " + size + " element :");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("start processing");
        reverse(arr);
    }
}
