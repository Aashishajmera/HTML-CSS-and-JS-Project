import java.util.Scanner;

public class leapYear

{
    public static void main(String[] args) {
        int year;
        System.out.println("leap year");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year");
        year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("leap year");
        }

        else {

            System.out.println("not leap year");

        }

    }

}
