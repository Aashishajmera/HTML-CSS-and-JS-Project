import java.util.Scanner;

public class Fibonacci {

    static int fib(int n ){

        // base case 
        if(n==0 || n==1){
            return n;
        }

        // return fib(n-1) + fib(n-2);

        // ya ishe eshe bhi kr sakte hai 

        // sub problem 
        int perv= fib(n-1);
        int pervper = fib(n-2);

        // self work 

        int ans= perv+pervper;
        return ans; 
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int no=sc.nextInt();

        for(int i=0; i<=no; i++){        // jaha i fibonacci term hai b
        System.out.println(fib(i));
        }





    }
}
