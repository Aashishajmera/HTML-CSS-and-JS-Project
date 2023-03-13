import java.util.Scanner;
public class compoundInterest {
public static void main(String[] args) {
    
float p;
float r;
float t;


    System.out.println("enter your principal");

    Scanner sc=new Scanner(System.in);
    p=sc.nextInt();

    System.out.println("enter your rate ");
    r=sc.nextInt();

    System.out.println("enter your time ");
    t=sc.nextInt();
   



    float si = (p*r*t)/100;
    System.out.println("your simple interest is " +si);
    System.out.println("your total amount is " +(p+si));

    float ta=(p+si);

    System.out.println("enter your principal");
    p=sc.nextInt();
    System.out.println(ta);
    System.out.println("enter your rate");
    r=sc.nextInt();
    System.out.println("enter your time");
    t=sc.nextInt();

float ci=(ta*r*t)/100;


    System.out.println("your compound interest is" +(ci));
    System.out.println("your total amount is "+(ta+ci));




}



}