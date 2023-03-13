import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        
        System.out.println("enter a no");
        Scanner sc = new Scanner(System.in);
        int no=sc.nextInt();
        System.out.println("prosessing start");
        int factorial=1;                         //ishme factorial ko 1 se start kiya jisse ki program me koi fark na pde
            for(int i=1; i<=no; i++){
        

                factorial *=i;                // nahi to agar 0 rkhte to ans hi 0 aata 
                System.out.println("you fatorial is " + i+ " : " +factorial);
            }
            System.out.println("your number ans is "+ factorial);


    }
}
