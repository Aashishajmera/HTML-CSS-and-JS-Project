
import java.util.Scanner;
public class nestedIf {
    public static void main(String[] args) {
        
        System.out.println("enter your age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age<20){

            if(age<18){

                System.out.println("bachcha");
            }

            else{
                System.out.println("londa");
            }

        }


    }
}
