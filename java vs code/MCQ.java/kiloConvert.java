import java.util.Scanner;

public class kiloConvert {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a 1 kilogram amount ");
        float amount = sc.nextFloat();

        int gram = 1000;

        float ans;

        ans = gram / amount;

        System.out.println(" 1 rupe me " + ans);

    }
}
