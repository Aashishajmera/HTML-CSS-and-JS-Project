import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        System.out.println("enter a no ");
        Scanner sc=new Scanner(System.in);
       int no=sc.nextInt();
       int sum=0;
        int i=1;

       while(i<=no)        /*    sum=0    i=1
                                and than print sum=sum+i
                                so sum=0+1
                                  sum=1
                                  to ab sum=sum+i        // i=2              // i ki value increase ho kr 1 bad gai jese 
                                                                        likha huaa hai i++ ish lie 
                                    sum=1+2
                                    sum=3    // i=3
                                    sum=sum+i
                                    sum=3+3
                                    sum=6    // i=4                                   syntax =  while(condition){
                                                                                                        //code
                                                                                                        }
                                    sum=sum+i
                                    sum=6+4
                                    sum=10      // i=5
                                    sum=sum+i
                                    sum=10+5
                                    sum=15


                                    jo no user input krega usi ke aage ka sum print hoga or wo no=hoga i ke 


                                    and ese hi aage bhi krna hai 
                                    or ye jab i jab tak increse hogi jab tak ki while ki condition false nhi ho jati  

       
                                    */

       {

        sum=sum+i;
        i++;
        System.out.println(sum);
        

       }


       System.out.println("your one word ans is" + sum );
    }
}
