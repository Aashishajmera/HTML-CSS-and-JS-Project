
import java.util.Scanner;

public class PrintNto1 {

    static void PrintDecrising(int n) {
        //Base case 
        if (n == 1) {
            System.out.println(n);
            return;
        }
        //self work
        System.out.println(n);    // ye n ko print kr dega

        // sub problem ya recorsive work ya smallest problem
        PrintDecrising(n - 1);        // yah line n-1 se 1 tak ke sare number print kr dega 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N number: ");
        int n = sc.nextInt();

        PrintDecrising(n);
    }
}
