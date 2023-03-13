public class logicalOperators {
    public static void main(String[] args) {
        
       int p=20, q=10;


        System.out.println(p == q); // false
        System.out.println(p > q); // true
        System.out.println(p < q);  // false
        System.out.println(p < q  && p>q); // false
        System.out.println(p>q && q<p && q<=p); // true ishme sabhi value true hona chahie 

        System.out.println(p < q ||  p>q); // true  because ishme koi ek true hona chahie 
    }
}
