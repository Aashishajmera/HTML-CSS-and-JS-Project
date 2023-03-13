import java.util.Scanner;

public class nyumerical {
    public static void main(String[] args) {
        
        System.out.println("enter a no");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();


        // 1234567
        // 2345671
        // 3456712
        // 4567123
        // 5671234
        // 6712345
        // 7123456

            for(int i=1; i <= r; i++){                                                  // i=1 yaha se suru hoga  or  i<=r tak chalega
                for(int j = i; j <= r; j++ ){                                            // j=i yaha se suru hoga or j<=r tak chalega
                                                                                        // uske bad k pr jaega ,,,,,, phir new line 
                                                                                        //and phir return i wali pe i++ phir j and k and new
                                                                                        // new line phir i pr 
                    System.out.print(j);
                }
                for( int k=1; k <=i-1; k++){
                    System.out.print(k);
                }
                System.out.println();
            }





    }
}
