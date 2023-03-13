import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter sum of number: ");
        int no = sc.nextInt();

        int sum = 0;

        while (no != 0) {

            sum+=no%10;
            no/=10;


        }
        System.out.println(sum);

    }
}
