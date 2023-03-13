public class incrementOperator {
    public static void main(String[] args) {
        
       int p=20, q=10;

       System.out.println(p++); // 20 21     
       System.out.println(++p); // 22

       System.out.println(q++); // 10 11  
       System.out.println(++q); // 12

       System.out.println(q--);   // 12 11
       System.out.println(--q);      // 10

       System.out.println(p--);    // 22 21
       System.out.println(--p);    // 20

        int x=p++;
        int y=++q; 

        System.out.println(x);  // 20  21   
        System.out.println(y);  // 11       




    }
}
