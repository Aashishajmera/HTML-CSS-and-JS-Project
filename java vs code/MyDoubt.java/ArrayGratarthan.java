import java.util.*;

public class ArrayGratarthan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter check graterthan number : ");
        int m = sc.nextInt();

        System.out.println("enter array size: ");
        int size = sc.nextInt();

        System.out.println("enter " + size + " element : ");

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int i = 0;
        int count = 0;

        while (i < size) {
            count++;
            while (i < size - 1 && arr[i + 1] == arr[i]) {
                i++;
            }
            i++;
        }
        if (count >= m) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
