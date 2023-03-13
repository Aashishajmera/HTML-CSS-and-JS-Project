
import java.util.Scanner;

public class pyramid2 {
    public static void main(String[] args) {

        for (int j = 1; j <= 5; j++) {
            System.out.print(" ");
        }
        for (int j = 6; j <= 7; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j = 1; j <= 5; j++) {
            System.out.print(" ");
        }
        for (int j = 6; j <= 6; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j = 1; j <= 4; j++) {
            System.out.print(" ");
        }
        for (int j = 5; j <= 5; j++) {
            System.out.print("*");
        }
        for (int j = 6; j <= 6; j++) {
            System.out.print(" ");
        }
        for (int j = 7; j <= 7; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j = 1; j <= 3; j++) {
            System.out.print(" ");
        }
        for (int j = 4; j <= 4; j++) {
            System.out.print("*");
        }
        for (int j = 5; j <= 7; j++) {
            System.out.print(" ");
        }
        for (int j = 8; j <= 8; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j = 1; j <= 11; j++) {
            if (j == 3 || j == 9 || j == 10) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.println();

        for (int j = 1; j <= 13; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j = 1; j <= 11; j++) {
            if (j == 3 || j == 9 || j == 10) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.println();

        for (int j = 1; j <= 11; j++) {
            if (j == 4 || j == 8) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.println();

        for (int j = 1; j <= 11; j++) { 
            if (j == 5 || j == 7) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 1; i <= 11; i++) {
            if (i == 6 ) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.println();

        // for (int i = 1; i <= 11; i++) {
        //     if (i == 6 ||i==7||i==8) {
        //         System.out.print("*");
        //     }
        //     System.out.print(" ");
        // }

    }

}
