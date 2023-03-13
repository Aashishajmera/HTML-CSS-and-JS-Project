import java.util.Scanner;

public class SumOfFollowing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a following series: ");
        int no = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= no; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
