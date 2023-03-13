import java.util.Scanner;

public class summ {
    public static void main(String[] args) {

        System.out.println("enter a no");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= no; i++) {
                                                                /*  
                                                                 * syntax for (int-statement ; condition ; final expresion){
                                                                    //code
                                                                          }
                                                                 */
            sum = sum + i;
            System.out.println(sum);

        }
        System.out.println("your last ans is " + sum);

    }
}