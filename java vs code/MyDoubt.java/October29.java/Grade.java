import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number : ");
        int no = sc.nextInt();

        if (no > 90) {
            System.out.println("A+");
        } else if (no > 80) {
            System.out.println("A");
        } else if (no > 70) {
            System.out.println("B+");
        } else if (no > 60) {
            System.out.println("B");
        } else if (no > 50) {
            System.out.println("C");
        } else if (no > 40) {
            System.out.println("D");
        } else if (no > 32) {
            System.out.println("E");
        }else if (no < 30) {
            System.out.println("Fail: ");
        }else{
            System.out.println("Enter valid number: ");
        }

    }
}
