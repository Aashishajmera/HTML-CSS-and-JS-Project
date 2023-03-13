import java.util.Scanner;

public class FristRepeat {

    static int FristRepeatvalue(int[] arr) {

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1; // yadi if blog vala code nhi chla to output me hame -1 milega !!

    }

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        System.out.println("enter size of array ");
        int size = r.nextInt();

        int[] arr = new int[size];

        System.out.println("enter " + size + " element ");

        for (int i = 0; i < size; i++) {

            arr[i] = r.nextInt();

        }

        System.out.println("frist repeat value is: " + FristRepeatvalue(arr));

    }
}
