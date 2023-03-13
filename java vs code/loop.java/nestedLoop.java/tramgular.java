import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class tramgular {
    public static void main(String[] args) {
        
        System.out.println("enter a row no");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();

        // *****
        // ****
        // ***
        // **
        // *

            // for(int i=1; i <= r; i++){
            //     for(int j=1; j <= (r+1-i); j++){
                    
            //             System.out.print("*");
            //     }
            //     System.out.println();
            // }

                for(int i=r; i>=1; i--){
                    for(int j=1; j<=i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }


    }
}
