
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        
        System.out.println("enter a Decimal_num "); 
        Scanner sc=new Scanner(System.in);
        int Decimal_num = sc.nextInt();

        int ans=0;   // convert binary number

        int pw=1; // because 10^0=1 power of 10

        while (Decimal_num>0){
            int parity=Decimal_num%2;
            ans += parity*pw;
            pw*=10;
            Decimal_num /=2;

        }

        System.out.println(ans);
    }
}
