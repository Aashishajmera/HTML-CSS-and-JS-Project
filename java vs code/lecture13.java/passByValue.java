public class passByValue {


   static void changeValue (int a){
    a *= 100;
    System.out.println("inside change value" +a);

    }


    public static void main(String[] args) {
        

        int a =10; 


        System.out.println("before changing value " +a);
        changeValue(a);
        System.out.println("after changing value " +a);

                                        // jesa ki  hamne dekha ki  a me 100 se guna nhi hua because a ki value pass hui 


    }
}
