import java.util.Scanner;

public class bank {

    public static void main(String[] args) {

        int money;
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your total amount");
        amount = sc.nextInt();
        System.out.println("enter your case = case1-debit money , case2-credit money , case3-chack money");
        int bank = sc.nextInt();

        switch (bank) {

            case 1:

                System.out.println("enter your send money");
                money = sc.nextInt();

                System.out.println("your send money is " + money);

                System.out.println("your total amount is" + (amount + money));

                break;

            case 2:

                System.out.println("enter your credit money");
                money = sc.nextInt();

                System.out.println("your credit money is " + money);

                System.out.println("your total amount is" + (amount - money));

                break;

            case 3:

                System.out.println("your total amount is" + amount);

                break;

            default:

                System.out.println("khatam");

        }

    }
}

