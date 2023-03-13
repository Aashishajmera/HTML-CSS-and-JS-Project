
import java.util.Scanner;

public class bloodDonet {
    public static void main(String[] args) {

        // System.out.println("enter your age");
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // System.out.println("enter your weight ");
        // int weight = sc.nextInt();
        // String ans;

        // ans = ((age >= 18) && (weight >= 49)) ? "eligible" : "sorry";

        // System.out.println(ans);

        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {

            System.out.println("enter your weight");
            int weight = sc.nextInt();

            if (weight >= 50) {

                System.out.println("congratulation");
            } else {
                System.out.println("sorry your weight is not 50+");
            }
        } else {
            System.out.println("you are not 18+");
        }

    }

}

/*
 * System.out.println("enter your age ");
 * Scanner sc = new Scanner(System.in);
 * int age = sc.nextInt();
 * System.out.println("enter your weight");
 * int weight=sc.nextInt();
 * if ((age >= 18) && (weight>49) ) {
 * 
 * System.out.println("your eligible");
 * }
 * else{
 * System.out.println("sorry ");
 * 
 * }
 * 
 */
