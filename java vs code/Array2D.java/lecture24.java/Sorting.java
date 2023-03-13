import java.util.Collections;
import java.util.ArrayList;

public class Sorting {

    static void reverseList(ArrayList<Integer> List) {

        int i=0, j=List.size()-1;

        while(i<j){
            /* 
             * int temp =a;
             * a=b;
             * b=temp;
             */

             Integer temp =Integer.valueOf(List.get(i));
             List.set(i, List.get(j));
             List.set(j, temp);

             i++;
             j--;
        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();
        List.add(0);
        List.add(32);
        List.add(5);
        List.add(6);
        List.add(13);
        List.add(5);
        List.add(33);
        List.add(90);

        System.out.println("original list " + List);
        // reverseList(List);   // ishka use na bhi kre to hmare pass ek collections name ki class hai jishshe ham ish class ko import krke array ko reverse kr sakte hai jese 
        // Collections.reverse(List);
        // System.out.println("reverse List " + List);
        // short krne ke lie direct ek mathord hai jishkka use krke ishe sort krenge jese 
        Collections.sort(List);
        System.out.println("Ascending order " + List);     // badte kram me 
        Collections.sort(List, Collections.reverseOrder());
        System.out.println("desending order " +List);    // ghatte kram me 


        ArrayList<String> l1 = new ArrayList<>();
        l1.add("wellcome");
        l1.add("to");
        l1.add("physics");
        l1.add("wallah");

        System.out.println("Original " +l1);
        Collections.sort(l1);
        System.out.println(" Ascending order me sorted" +l1);  // badte kram me 
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("desending order me sorted " +l1);   // ghatte kram mme 



        // ye jo sort array mathod ka use ho rha hai inhe ham or kisi bhi tarah ke data type me use kr sakte hain : 
    }

}
