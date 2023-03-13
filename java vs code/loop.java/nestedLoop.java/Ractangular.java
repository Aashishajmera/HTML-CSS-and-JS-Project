import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Ractangular {
    public static void main(String[] args) {
        
        System.out.println("enter a row no");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println("enter a colom no");
        int c=sc.nextInt();

        // *******
        // *     *
        // *     *
        // *     *
        // *******

            for(int i=1; i <= r; i++){
                for(int j=1; j <= c; j++){
                    if(i == 1 ||  i == r  || j == 1 || j == c )
                        System.out.print("*");
                    else
                    System.out.print(" ");
                }
                System.out.println();
            }


    }
}
