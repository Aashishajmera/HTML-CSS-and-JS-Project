import java.util.Scanner;

public class Repeat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array:");
        int size = sc.nextInt();

        System.out.println("enter " + size + " element");

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(" vlue is:" + arr[j] + " and repeating index is: " + (i+1)+" and " + (j+1));
                    return;
                }
            }
        }
        System.out.println("sorry not repeat value: ");
        

    }

}
