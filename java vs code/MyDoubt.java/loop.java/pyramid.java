import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no = sc.nextInt();

        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= no - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 2; l < i + 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= no - i; k++) {
                System.out.print("*");
            }
            for (int l = no - i; l > 1; l--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
