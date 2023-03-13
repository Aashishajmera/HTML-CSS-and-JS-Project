import java.util.Scanner;

public class Factorial {

    static int Factorial(int n) {

        // Base case

        if (n == 0) {                                           // ishe ham n==1 se bhi kr sakte the
            return 1;
        }

        // sub problem

        int subProblem = Factorial(n - 1);

        // self work ya big problem

        int ans = n * subProblem;                                                       // return n*Factorial(n-1)

        return ans;

    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();

       System.out.println(Factorial(n)); 
    }
}
