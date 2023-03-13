import java.util.Scanner;

public class SumOfDigits {

    static int SOD(int no) {
        if (no >= 0 && no <= 9) {
            return no;

        }

        int frist_n_digit = SOD(no / 10);
        int last_digit = (no % 10);

        int ans = last_digit + frist_n_digit;

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no = sc.nextInt();

        System.out.println(SOD(no));

    }
}
