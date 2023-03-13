import java.util.Scanner;

public class Absualte {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int no = sc.nextInt();     

        if (no < 0) {
            no *= -1;
            System.out.println("this number is negative and absulate value is :");
            System.out.println(no);
        } else {
            System.out.println(" the value is: " + no);
        }

    }
}
