import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        
            System.out.println("enter a rows");
            Scanner sc = new Scanner(System.in);
            int r=sc.nextInt();
            System.out.println("enter a colom");
            int c=sc.nextInt();

            // 123456789
            // 123456789
            // 123456789
            // 123456789
            // 123456789
            // 123456789











            for(int i=1; i<=r; i++){
                for(int j=1; j<=c; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
    }
}
