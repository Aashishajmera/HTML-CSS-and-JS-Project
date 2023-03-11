import java.util.*;
public class Partition {

    static int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr) {
        int totalSum = findArraySum(arr);

        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if (suffixSum == prefixSum) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int size = sc.nextInt();

        int[] arr = new int[size + 1];
        System.out.println("enter " + size + " element ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("Equal partition possible: " + equalSumPartition(arr));

    }
}
