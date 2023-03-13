import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class countt {
    public static void main(String[] args) {
        
        System.out.println("enter a your  counting no");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        for(int i=1; i<=no; i++)
        {
            System.out.println(i);
        }



    }
}
