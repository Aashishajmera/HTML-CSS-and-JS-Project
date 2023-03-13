import java.util.Scanner;

public class MyThink {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int no = sc.nextInt();


/*

 ********
  *******
   ******
    *****
     ****
      ***
       **
        * 
*/

        for (int i = 1; i <= no; i++) {
              for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k=no; k>i; k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
