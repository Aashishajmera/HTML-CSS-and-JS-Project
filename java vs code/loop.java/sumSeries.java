import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class sumSeries {
    public static void main(String[] args) {
        

        System.out.println("enrer a no");
        Scanner sc= new Scanner(System.in);
        int no=sc.nextInt();

        int sumseries=0;

        for(int i=1; i<=no; i++){
            if(i%2==0){
                sumseries -= i;      // ishe ese bhi likh sakte hai sumseries-=sumseries-i;
            }
            else{
                sumseries +=i;       // ishe ese bhi likh sakte hai sumseries+=sumseries+i;
            }

        }

        System.out.println(sumseries);




    }
}
