import java.util.Scanner;

public class BinaryToDacimal {
    public static void main(String[] args) {
        
        System.out.println("enter a Binary_num "); 
        Scanner sc=new Scanner(System.in);
        int Binary_num = sc.nextInt();

        int ans=0;   // convert decimal number

        int pw=1; // because 2^0=1 power of 2 

        while (Binary_num>0){
            int unit_digit=Binary_num%10;
            ans += unit_digit*pw;
            Binary_num/=10;
            pw*=2;

        }

        System.out.println(ans);
    }
}
