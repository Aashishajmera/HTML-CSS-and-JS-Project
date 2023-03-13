public class BitwiseOperators {
    public static void main(String[] args) {
        

        int a=9,b=10;

        System.out.println(a | b);  // 11            
        System.out.println(a & b);  // 8
        System.out.println(a ^ b);  //3

        System.out.println(a << 1); // 18         //   a<<1= a*2^1     // formula  a<<b=a*2^b
        System.out.println(a << 2); //36          //   a<<2= a*2^2     

        System.out.println(b >> 1); //5           //   b>>1= b/2^1     // formula a>>b=a/2^b
        System.out.println(b >> 2); //2           ////   b>>2= b/2^2



    }
}
