import java.util.Scanner;

public class CountNNumber {

    static void PrintIncresing(int n){
        // base case
        if(n==1){
            System.out.println(n);
            return;
        }
        // recursive work
        PrintIncresing(n-1);

        // self work 
        System.out.println(n);
    }



    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N number: ");
        int n=sc.nextInt();

        PrintIncresing(n);






    }
}
