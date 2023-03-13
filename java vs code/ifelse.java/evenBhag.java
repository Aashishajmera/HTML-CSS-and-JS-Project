import java.util.Scanner;

public class evenBhag {
    public static void main(String[] args) {

        System.out.println("enter a  no");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        /*
         * if (num % 2 == 0 && num % 3 == 0)
         * 
         * {
         * System.out.println("even and 3");
         * } else if (num % 2 == 0)
         * 
         * {
         * System.out.println("even");
         * } else {
         * System.out.println("odd");
         * }
         */

        if (num % 3 == 0 || num % 5 == 0) {
            System.out.println("divide 3 ya 5");
        }

        else {
            System.out.println("not 3 and 5");
        }
    }
}
