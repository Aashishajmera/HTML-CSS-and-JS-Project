import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Wrapper classes

        Integer in = Integer.valueOf(2);
        System.out.println(in);
       

        ArrayList<Integer> l1 = new ArrayList<>();

        // add new elements

        l1.add(3);  // 3                 // add mathod se aage hi aage add ho rha hai 
        l1.add(4);  // 3 4
        l1.add(5);  // 3 4 5
        l1.add(6);  // 3 4 5 6

        // get an element at index i

        System.out.println(l1.get(1)); // 3

        // print with for loop

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i)); // 3 , 4, 5
        }

        // printing the array list directly

        System.out.println(l1); // [3,4,5,6]

        // adding element at some index i

        l1.add(1,100);  //[3,100,4,5,6]
        System.out.println(l1);


        // modifying element at index i

        l1.set(1, 10);   //[3,10,4,5,6]
        System.out.println(l1);

        // removing an element at index i

        l1.remove(1);     //[3,4,5,6]
        System.out.println(l1);

        // removing an element e
         
        l1.remove(Integer.valueOf(4)); // agar ham ishe print krna chahe to to ye boolean value return krta hai jese ki   System.out.pritnln(l1.remove(Integer.valueOf(4)));   agar yah value hogi to true vrna false  //[3,5,6]
        //System.out.println(l1.remove(Integer.valueOf(4)));    // ishshe true ya false return hoga : 
        System.out.println(l1);

        // checking if an element exists

        boolean ans = l1.contains(Integer.valueOf(5));   // ab ye 5 element hai ishlie true aa gya nhi to false aa jata
        System.out.println(ans);

        // if you don't specify class , you can put anything inside l

        ArrayList l = new ArrayList();
        l.add("press");
        l.add(2);
        l.add(3.5);
        System.out.println(l);



    }
}
