import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int size = sc.nextInt();

        System.out.println("enter " + size + " element");

        int[] arru = new int[size];

        for (int i = 0; i < arru.length; i++) {
            arru[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arru.length; i++) {
            if (arru[i] % 2 != 0) {
                sum += arru[i];
            }
        }
        System.out.println(" odd number sum is:"+sum);

    }
}
