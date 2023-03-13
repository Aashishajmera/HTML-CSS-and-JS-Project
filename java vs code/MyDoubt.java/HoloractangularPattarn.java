import java.util.Scanner;

public class HoloractangularPattarn {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row:");
        int r=sc.nextInt();
        System.out.println("entr columns:");
        int c=sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if(i+j == r+1 || i-j == r-1 || i==r){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }







    }
}
