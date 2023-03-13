import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class streamOfTwoo {
    public static void main(String[] args) {
        
        System.out.println("enter a no ");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int sum=0;
        do{
            sum+=no;
            System.out.println("enter a other no");
            no=sc.nextInt();
        }
        while(no !=-1);   // user ke davara -1 input krne pr code output dega and jab tak aap jo bhi unput kroge wo sab ka addition ho jaega 
                            // yah program do while me bna hai ish lie condition false hone pr bhi yah code ek bar to out put dega hi 
{
        System.out.println(sum);
}

    }
}
