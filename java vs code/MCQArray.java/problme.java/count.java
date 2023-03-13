import java.util.Scanner;

public class count {

    static void PrintArray(int[] arr) {

        Scanner sc = new Scanner(System.in);

        System.out.println("chack repeat number: ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.print( x +" is repeat  " + count + " time: ");
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
