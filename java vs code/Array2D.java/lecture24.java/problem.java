import java.util.Collections;
import java.util.ArrayList;

public class problem {

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
        Collections.reverse(List);
        System.out.println("reverse List " + List);

    }

}
