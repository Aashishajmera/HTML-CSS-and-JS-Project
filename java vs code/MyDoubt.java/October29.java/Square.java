import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        float length = sc.nextFloat();
        System.out.println("Enter breadth: ");
        float breadth = sc.nextFloat();



        if ( length == breadth) {
            System.out.println("this is square : ");
        } else {
            System.out.println("this is not square :");
        }

    }
}
