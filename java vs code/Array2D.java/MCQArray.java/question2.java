import java.util.Arrays;
import java.util.Scanner;

public class question2 {


    static void copyArray(int[] arr){                     // ye mathod ishlie bnai hai because hame bar bar print krane wala for loop print na krana pde

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] smallestAndLargestElement(int[]arr){
        Arrays.sort(arr);
        int ans[]={arr[0],arr[arr.length-1]};
        return ans;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter " + size + " element ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        smallestAndLargestElement(arr);    // yaha pr ish mathod ko call kra 



        // copyArray(arr);

        int[] ans = smallestAndLargestElement(arr);
        System.out.println("smallest:"+ans[0]);
        System.out.println("largest:"+ans[1]);
       

    }
}
