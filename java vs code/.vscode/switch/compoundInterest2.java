import java.util.Scanner;

public class compoundInterest2 {
    public static void main(String[] args) {


        double principal;
        double rate;
        double time;
        double ans;
        
        
        Scanner sc=new Scanner(System.in);


        System.out.println(  "enter case: case 1: yearly , case 2: monthly , case 3: daily , case 4: year and month, case 5: month and day , case 6: year and day, case 7: year month and day ");
        int simpleInterest= sc.nextInt();


       switch(simpleInterest){


        case 1:
        System.out.println("enter principal");
         principal=sc.nextDouble();
        System.out.println("enter rate");
         rate=sc.nextDouble();
        System.out.println("enter time");
         time=sc.nextDouble();

        ans=principal *(Math.pow((1+rate/100*12),time)) - principal; 

       System.out.println("your compound interest is:  " + ans);

        System.out.println("your total amount is:" +(principal+ans));

        break;


        case 2:
        System.out.println("enter principal");
         principal=sc.nextDouble();
        System.out.println("enter rate");
       rate=sc.nextDouble();
        System.out.println("enter time");
        time=sc.nextDouble();

        ans=principal *(Math.pow((1+rate/100),time)) - principal; 

       System.out.println("your compound interest is:  " + ans);

        System.out.println("your total amount is:" +(principal+ans));

        break;


        case 3:
        System.out.println("enter principal");
         principal=sc.nextDouble();
        System.out.println("enter rate");
       rate=sc.nextDouble();
        System.out.println("enter time");
        time=sc.nextDouble();

        ans=principal *(Math.pow((1+rate/100/31),time)) - principal; 

       System.out.println("your compound interest is:  " + ans);

        System.out.println("your total amount is:" +(principal+ans));

        break;


       }

    }
    
}
