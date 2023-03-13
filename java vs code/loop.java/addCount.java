import java.util.Scanner;

public class addCount {
    public static void main(String[] args) {
        
        System.out.println("enter a no");
        Scanner sc =new Scanner(System.in);
        int no=sc.nextInt();

        int sumOfNum=0;
        int original_n=no;

        while(no>0){
            
            sumOfNum+=no%10;
            no=no/10;



        }



System.out.println("your somOfnum is "+ original_n+" = "+sumOfNum);



    }
}
