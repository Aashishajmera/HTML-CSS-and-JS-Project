import java.util.Scanner;

public class SqureRactangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of squre ractangle: ");
        int length = sc.nextInt();
        System.out.println("enter breadth of squre ractangle: ");
        int breadth = sc.nextInt();

        int Area = length * breadth;
        int perimeter = 2 * (length + breadth);

        if (Area > perimeter) {
            System.out.println("Area is grathar than perimeter: ");
        } else if (perimeter>Area) {
            System.out.println("perimeter is grathar than Area: ");
        } else  {
            System.out.println("Area and perimeter is equal: ");
        }

    }
}
