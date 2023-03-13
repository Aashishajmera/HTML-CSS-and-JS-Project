import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        


        System.out.println("enter your age");

        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();

        if(age<=12){
        System.out.println("bachha hai lalla tu abhi");
        }
        else if(age<=18)
        
        // ishe ese bhi likh sakte the 
        // else if(age>12  && age<18 )
        
        {
            System.out.println("javan ho gya londa");
        }
        else {
            System.out.println("saadi layak ho gya londa");
        }


    }
}
