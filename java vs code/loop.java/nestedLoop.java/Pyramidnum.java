import java.util.Scanner;

public class Pyramidnum {
    public static void main(String[] args) {

        

        // 1
        // 2 2
        // 3 3
        // 4444444

       for(int i=1; i<=4; i++){
        for (int j=1; j<=7; j++){
            if(i+j==5 || i-j==3){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }

    }
}
