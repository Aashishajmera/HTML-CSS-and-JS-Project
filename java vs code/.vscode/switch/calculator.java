import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        float no1;
        float no2;

        System.out.println("enter your case = case1: addition, case2: subtraction, case3: multiply, case4: divide ");

        Scanner sc = new Scanner(System.in);
         int calculator = sc.nextInt();

        switch (calculator) {

            case 1:
                System.out.println("enter a no1");
                no1 = sc.nextFloat();
                System.out.println("enter a no2");
                no2 = sc.nextFloat();

                System.out.println("your no1 and no2 addition is " + (no1 + no2));

                break;

            case 2:
                System.out.println("enter a no1");
                no1 = sc.nextFloat();
                System.out.println("enter a no2");
                no2 = sc.nextFloat();

                System.out.println("your no1 and no2 addition is " + (no1 - no2));

                break;

            case 3:
                System.out.println("enter a no1");
                no1 = sc.nextFloat();
                System.out.println("enter a no2");
                no2 = sc.nextFloat();

                System.out.println("your no1 and no2 addition is " + (no1 * no2));

                break;

            case 4:
                System.out.println("enter a no1");
                no1 = sc.nextFloat();
                System.out.println("enter a no2");
                no2 = sc.nextFloat();

                System.out.println("your no1 and no2 addition is " + (no1 / no2));

                break;

            default:

                System.out.println("case not found");
        }

    }
}
