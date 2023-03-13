import java.util.*;

class Algebra {

    Algebra(){                                                    // ye Algebra class ka constructor bnaya hain 
        System.out.println("constructor of Algebra called ");
    }
    
    int add(int a, int b) {         // mathod name add hai 
        int ans = a + b;
        return ans;
    }
}


public class Add {
    public static void main(String[] args) {             // yah main mathod hai 
        Algebra obj1 = new Algebra();                     // algebra class ka object bnaya 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number:");
        int x = sc.nextInt();
        System.out.println("enter a second number:");
        int y = sc.nextInt();

        System.out.println("sum of input number is");
        
     //   System.out.println(obj1.add(x, y));            // ishko ham ese bhi likh sakte hai 
    
    
        int ans = obj1.add( x , y);
        System.out.println(ans);
    
    
    
    }
}
