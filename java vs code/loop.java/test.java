import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        
        System.out.println("enter a no");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();

        int ans =1;
        for(int i=1; i<= no; i++){
            ans*=i;
            System.out.println(+ans);
        }

        System.out.println("your total ans is "+ans);
    }
}
