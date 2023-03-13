import java.util.Scanner;

public class reverseCount {
    public static void main(String[] args) {
        
        System.out.println("enter a no");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();

        for (int i=no; i>=1; i--)    // i+=2    i=i+2    ishme i ki value 2-2 se increse hogi     // i++ ko ya i-- ko ese bhi likh sakte the  i+=1 ya i-=1 likh sakte hai
                                    // i-=3   i=i-3    har bar i ki value 3 - 3 increse hogi 
        {
            System.out.println(i);
        }



    }
}
 