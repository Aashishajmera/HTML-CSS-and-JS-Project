import java.util.Scanner;

public class doWhilel {
    public static void main(String[] args) { /*
                                              * syntax // kitni bar run krna hai pta na ho to do while ka use krte hai
                                              * 
                                              * variable initialize
                                              * do{
                                              * //code
                                              * i++
                                              * } while(condition)
                                              * 
                                              * 
                                              */

        System.out.println("enter a no");
        Scanner sc = new Scanner(System.in);
        int no=sc.nextInt();

        int i = 100; // ishme no agar 100 se choota hoga to print nhi hona chahie but ek bar print
                     // hoga or phir print nhi hoga

        do {
            System.out.println(i);
            i++;
        } while (i <= no);

    }
}
