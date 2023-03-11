import java.util.Scanner;

public class NonDecreasing {

    static void printArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

static void reverse(int[] arr){
    int size=arr.length;
    for (int i = size-1; i >=0 ; i--) {
        System.out.print(arr[i] + " ");
    }
}

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void Increasing(int[] arr) {

        int size = arr.length;
        int left = 0, right = size - 1;

        while (left <= right) {
            if (arr[left] < arr[right]) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] > arr[right]) { // even and odd ko parity bolte hai
                left++;
            }
            if (arr[right]<arr[left]) { // ishe ham arr[right]%2 == 1 hai to
                right--;
            }
        }

        // printArray(arr);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size  ");
        int size = sc.nextInt();

        System.out.println("enter binary " + size + " element");

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("original array:");
        printArray(arr);
        System.out.println("sorted array:");
        Increasing(arr);
        printArray(arr);
        System.out.println("non decreasing array:");
        reverse(arr);
      

    }
}
