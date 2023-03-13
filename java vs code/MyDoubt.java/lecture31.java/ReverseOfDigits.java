import java.util.*;;

public class ReverseOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter Reverse of number: ");
        int no = sc.nextInt();

        int reverse = 0;
        int ans = 0;
        int sum = 0;
        while (no > 0) {
            // 345
            reverse = no % 10;
            ans = (ans * 10) + reverse;
            no /= 10;
        }
        System.out.println(ans);
        while (ans > 0) {
            sum += ans % 10;
            ans /= 10;
        }
        System.out.println(sum);

    }
}
