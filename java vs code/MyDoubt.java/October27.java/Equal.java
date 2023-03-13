
import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
                                                        
        Scanner sc = new Scanner(System.in);
       
        int p=11, q=21;
// Arithmatic operator 

        System.out.println(p+q);  // - * / % 



// relational operator

        System.out.println(p==q);
        System.out.println(p!=q);
        System.out.println(p>q);
        System.out.println(p<q);
        System.out.println(p<=q);
        System.out.println(p>=q);

// Logical operator

        System.out.println(!(p==q));     // 2 operator or bhi hai && || 



// assignment operator

      System.out.println(p += q);   // -=  ,  *=   , /=  , %= , = 


      // Unaray operator 

      System.out.println("Post increment operator");
      System.out.println(p++);        // ++ -- + - 

        // alag 
                                        // 33
       System.out.println(p++);                // 33
       System.out.println(p);        //34
                                                  //34
        System.out.println(++p);        // 35
        System.out.println(p);                // 35

       // Bitwise operator 

int t=4;

        System.out.println(t<<2);  // 16        // >> , << , >>> , ~ , & , ^ 
        System.out.println(t<<2);  // 16

    }
}
