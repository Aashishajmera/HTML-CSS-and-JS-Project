import java.util.Scanner;

public class takingInput
{
 
    public static void main (String[] args)
    {
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
         name=sc.nextLine();
        System.out.println("your name is : " +name);



        //integar ke lie 

        int a;
        System.out.println("enter your lucky  no");
        a=sc.nextInt();
        System.out.println("your lucky no is: " +a);

    }


}
