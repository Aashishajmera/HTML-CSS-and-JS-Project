import java.util.Scanner;

public class Rotate {



    static int[] rotateArray(int[] arr, int k) {
        int size = arr.length;
        k = k % size;
        int[] ans= new int[size];
        int j = 0;

        for (int i = size - k; i < size; i++) {
            ans[j++] = arr[i];

        }
        for (int i = 0; i < size - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void copyArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("enter " + size + " element");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("enter k time rotate:");
      int  k=sc.nextInt();

      System.out.println("original array");
      copyArray(arr);

      int[] ans = rotateArray(arr, size);
      System.out.println("array after rotating:");
    copyArray(ans);
    }
}
