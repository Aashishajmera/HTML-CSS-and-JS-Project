import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.println("enter a no");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();

        for(int i=0; i<=no; i++){

            if(i==5){
                break;
            }

            System.out.println(i);
            
        }
        

    }
    
}
