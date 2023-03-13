import java.util.Scanner;

public class power  {
    public static void main(String[] args) {
        

        System.out.println("enter a number A");
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.println("enter a number B");
        int B=sc.nextInt();
        System.out.println("prosessing start");
            int square=1;

            
                for(int i=1; i<=B; i++)
                {
                    square=square*A;      // shortcut square*=A;
                    System.out.println(square);
                }

                System.out.println("your ans is "+square);

    }
    
}
