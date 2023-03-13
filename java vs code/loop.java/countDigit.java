import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        
System.out.println("enter a no");
Scanner sc =new Scanner(System.in);
int no=sc.nextInt();

 int numOfDigit=0;
 int original_n = no;

while(no>0){

    no=no/10;
    numOfDigit++;   // numOfDigit = nomOfDigit +1;


}

    System.out.println("number of digit is "+ original_n +" = "+ numOfDigit);

    }
}
