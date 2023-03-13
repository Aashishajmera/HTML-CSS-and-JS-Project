import java.util.Scanner;

public class persent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a persentage : ");
        int n = sc.nextInt();

        if (n > 90) {
            System.out.println("Excellent:");
        }
       else if (n > 80) {
            System.out.println("good: ");
        } else if( n>40){
            System.out.println("bad");
        }else if(n<33){
            System.out.println("Fail..............!!");
        }

    }
}
