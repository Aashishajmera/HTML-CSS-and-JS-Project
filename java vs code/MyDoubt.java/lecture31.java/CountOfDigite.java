import java.util.Scanner;

public class CountOfDigite {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the count of number : ");
        int no = sc.nextInt();
        int count = 0;
        // 124
        while (no > 0) {
            count++;

            no /= 10;

        }
        System.out.println(count);

    }
}
