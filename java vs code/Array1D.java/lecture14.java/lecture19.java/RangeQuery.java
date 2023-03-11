import java.util.Scanner;

/* yah 1 based index se suru hota hai  */
public class RangeQuery {

    static int[] makePrefixSumArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int size = sc.nextInt();

        int[] arr = new int[size + 1];
        System.out.println("enter " + size + " element ");
        for (int i = 1; i <= size; i++) {
            arr[i] = sc.nextInt();

        }

        int[] perfSum = makePrefixSumArray(arr);
        System.out.println("Enter number of queries:");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("enter l size rage:");
            int l = sc.nextInt();
            System.out.println("enter r size rage:");
            int r = sc.nextInt();
            int ans = perfSum[r] - perfSum[l - 1];
            System.out.println("sum:" + ans);

        }

    }

}
