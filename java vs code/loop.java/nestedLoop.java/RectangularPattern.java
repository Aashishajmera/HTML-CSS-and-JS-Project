
import java.util.Scanner;

public class RectangularPattern {
    public static void main(String[] args) {

       

        System.out.println("enter a no");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("enter a second no");
        int c = sc.nextInt();

        // *******
        // *******
        // *******
        // *******
        // *******









        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
