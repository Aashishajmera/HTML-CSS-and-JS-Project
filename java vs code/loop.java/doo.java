import java.util.Scanner;

public class doo {
    
    public static void main(String[] args) {
        
        System.out.println("enter a no");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int i=1;
        do{

            System.out.println(i);
            i++;
        } while(i<=no);


    }
}
