import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {

        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        // tarnary operator se


        String ans;
        ans = ( num % 2 == 0) ? "even" : "odd";
        System.out.println(ans);




        // ifelse statment se 

       /*  if (num % 2 == 0)  

        {
            System.out.println("given no is even");
        } else {
            System.out.println("given no is odd");
        }

        */

    }
}
