import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ract {
    public static void main(String[] args) {
        
        System.out.println("enter a row no");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();

        // *                            
        // **
        // ***
        // ****
        // *****
        // ******
        // *******


            // for(int i=1; i <= r; i++){
            //     for(int j=1; j <= i; j++){
                    
            //             System.out.print("*");
            //     }
            //     System.out.println();
            // }


            // 1
            // 12
            // 123
            // 1234




                for(int i=1; i<=r; i++){
                    for(int j=1; j<=i; j++){
                        System.out.print(i);
                    }
                    System.out.println();
                }



    }
}
