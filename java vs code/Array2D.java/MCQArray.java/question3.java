import java.util.Arrays;
import java.util.Scanner;

public class question3 {

    static void copyArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] KsmallestAndKLargestElement(int arr[] , int k){
        Arrays.sort(arr);
       int ans[]= { arr[k-1], arr[arr.length-k]};
       return ans;
       
    }


  


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter " + size + " element");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter k element");
        int k=sc.nextInt();

        System.out.println("start processing ");
      
      

       int ans[]= KsmallestAndKLargestElement(arr,k);
       System.out.println(ans);

       System.out.println(k+ " smallest:" + ans[0]);
       System.out.println(k + " largest:" + ans[1]);


        
    }
}
