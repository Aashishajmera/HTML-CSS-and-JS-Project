import java.util.Scanner;


/* given ann integer array 'a' return the prefix sum / running sum in the same array without creating a new array  */


public class prefixSum {

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]  +" ");
        }
        System.out.println();
    }
    
    static int[] makePrefixSumArray(int[] arr){
       int size=arr.length;
        int [] pref=new int [size];
        pref[0] = arr[0];
        for(int i=1; i<size; i++){
            pref[i]=pref[i-1] + arr[i];
        }
return pref;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int size=sc.nextInt();

        int [] arr = new int [size];
        System.out.println("enter " + size + " element ");

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("input array:");
        printArray(arr);

        System.out.println("prefix sum array is: ");
        int [] pref = makePrefixSumArray(arr);
        printArray(pref);

    }
}
