import java.util.Scanner;

public class PairSum {

    static void copyarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i] + " ");
        }
        System.out.println();
    }

    static int PairSum2(int[] arr, int target) {
        int size = arr.length;
        int ans = 0;
        for (int i = 0; i < size; i++) {       // first number 
            for (int j = i + 1; j < size; j++) {    // second number 
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");

        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("enter " + size + " element ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter target sum: ");
        int target = sc.nextInt();

        int ans = PairSum2(arr, target);

        System.out.println("your targer is: " + ans);

    }
}
