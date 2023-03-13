import java.util.Scanner;

public class numPyramid {
    public static void main(String[] args) {

        System.out.println("enter a row  no");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("enter a colom no");
        int c = sc.nextInt();

        // 1212121
        // 2121212
        // 1212121
        // 2121212
        // 1212121
        // 2121212

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++)
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }

            System.out.println();
        }

    }
}
