import java.util.Scanner;

public class streamOfTwo {
    public static void main(String[] args) {
        
        System.out.println("enter a no");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int sum=0;


        while(no!=-1 ){      // jab tak user -1 input nhi krega tab tak code output nhi dega  or wo jitne bhi no input ktrga unka jod ho jaega 

            sum += no;   // sum=sum+no;
            System.out.println("enter a other addition no");
            no=sc.nextInt();


        }
        System.out.println(sum);

    }
}
