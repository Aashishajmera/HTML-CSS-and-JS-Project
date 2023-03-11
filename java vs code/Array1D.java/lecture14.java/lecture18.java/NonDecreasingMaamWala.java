
import java.util.Scanner;

// public class NonDecreasingMaamWala {

//     static void printArray(int[] arr) {
//         int size = arr.length;
//         for (int i = 0; i < size; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static void Reverse(int[] arr) {

//         int size = arr.length;
//         int i = 0, j = size - 1;

//         while (i < j) {
//             {
//                 swap(arr, i, j);
//                 i++;
//                 j--;
//             }

//         }

//     }

//     static int[] SortSquares(int[] arr) {

//         int size=arr.length;
//         int left=0 , right=size-1;
//         int[] ans=new int [size];
//         int k=0;
//         while(left<=right){
//             if(Math.abs(arr[left]) > Math.abs(arr[right])){
//                 ans[k++]=arr[left] * arr[left];
//                 left++;
//             }
//             else{
//                 ans[k++]=arr[right] * arr[right];
//                 right--;
//             }
//         }
//         Reverse(ans);
//         return ans;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter array size  ");
//         int size = sc.nextInt();

//         System.out.println("enter binary " + size + " element");

//         int[] arr = new int[size];

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("original array:");
//         printArray(arr);
//        int[] ans= SortSquares(arr);
//         System.out.println("sorted array:");
//         printArray(ans);

//     }
// }


/* ek tarika or hai jishme hame reverse mathod ki jarurat nhi hoti hai jese */


public class NonDecreasingMaamWala {

    static void printArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void Reverse(int[] arr) {

        int size = arr.length;
        int i = 0, j = size - 1;

        while (i < j) {
            {
                swap(arr, i, j);
                i++;
                j--;
            }

        }

    }

    static int[] SortSquares(int[] arr) {

        int size=arr.length;
        int left=0 , right=size-1;
        int[] ans=new int [size];
        int k=size-1;
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k--]=arr[left] * arr[left];
                left++;
            }
            else{
                ans[k--]=arr[right] * arr[right];
                right--;
            }
        }
        return ans;
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
       int[] ans= SortSquares(arr);
        System.out.println("sorted array:");
        printArray(ans);

    }
}