import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        
        System.out.println("enter a no");
        Scanner sc =new Scanner(System.in);
        int no=sc.nextInt();

        int reverseOfNum=0;
        int original_n=no;

        while(no>0){
            
            reverseOfNum = reverseOfNum*10+no%10;
            no=no/10;     // last disit ko khatam kerne ke lie 



        }



System.out.println("your reverse no is "+ original_n+" = "+reverseOfNum);



    }
}
