import java.util.Scanner;

public class Rational {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter sum of number: ");
        int n= sc.nextInt();

        // int sum=0;
        // for(int i=1; i<=n; i++){
        //     sum += i;
        //     System.out.println(sum);

        // }
        // System.out.println("your total ans is:" +sum);


        // int sum=0;
        // for(int i=2; i<=n; i+=2){
        //     sum += i;
        //     System.out.println(sum);

        // }
        // System.out.println("your total ans is:" +sum);

        

        int ans = n(n+1)/2;
        System.out.println(ans);



    }
}
