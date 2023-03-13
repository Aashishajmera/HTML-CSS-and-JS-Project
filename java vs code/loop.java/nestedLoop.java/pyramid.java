import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        
        System.out.println("enter a no");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();


    //      *
    //     ***
    //    *****
    //   *******
    //  *********
    // ***********


                // i me hi j hai or k bhi dono i ke andar hi hai !!




        // for(int i=1; i <= r; i++){  
        //                                             //traversing over rows    
        //                                           //print r-i spaces
        //     for(int j=1; j <= r-i; j++){
        //         System.out.print(" "); 
        //     }
        //     //print 2*1 - 1 s
        //      for (int k=1 ; k<= 2*i-1; k++){
        //         System.out.print("*");
        //      }
        //      System.out.println();
        // }


    //      1
    //     121
    //    12321
    //   1234321
    //  123454321
    // 12345654321



                for(int i=1; i<=r; i++){
                    for(int j=1; j<=r-i; j++){
                        System.out.print(" ");
                    }
                    // print 1 to i
                    for (int k=1; k<=i; k++){
                        System.out.print(k);
                    }
                    // prirnt i-1 to 1
                    for(int l=i-1; l>=1; l--){
                        System.out.print(l);
                    }


                    System.out.println();
                }
    }
}
