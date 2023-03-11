import java.util.Scanner;

public class ShortValue {

    static void printArray(int[] arr){
        int size=arr.length;
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    static void swap(int[] arr, int i, int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    static void sortZeroesAndOnes(int [] arr){
        int size=arr.length;
        
        int zeroes=0;
        // count number of zeroes

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zeroes++;
            }
        }


        // 0 to zeroes-1 : 0 , zeroes to n-1 : 1

        for(int i=0; i<arr.length; i++){
            if(i<zeroes){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }


    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size  ");
        int size= sc.nextInt();

        System.out.println("enter binary " + size + " element");

        int [] arr=new int[size];

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

System.out.println("original array:");
printArray(arr);
System.out.println("sorted array:");
sortZeroesAndOnes(arr);
printArray(arr);




    }
}
