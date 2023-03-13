import java.util.Scanner;

public class bre {
    public static void main(String[] args) {

        System.out.println("enter a no");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        for (int i = 0; i <= no; i++) {

            if (i == 7) { // agar user no 7 se jayada input krta hai to bhi yah program 7 ke aage output
                          // print nhi krega because break keyword lga huaa hain

                break;
            }
            System.out.println(i);

        }

    }
}
