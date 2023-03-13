import java.lang.annotation.Target;
import java.util.Scanner;


public class tripleSum {
    
    static int tripleSum2(int[] arr, int targer){

        int size= arr.length;
        int ans=0;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                for(int k=j+1; k<size; k++){
                    if(arr[i]+arr[j]+arr[k]==targer){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();

        int arr[] = new int [size];
    
System.out.println("enter " + size + " element ");
        for(int i=0; i<arr.length; i++){
           arr[i]=sc.nextInt();

        }
        System.out.println("enter triple target sum: ");
        int targer=sc.nextInt();
        int ans=tripleSum2(arr, targer);
        System.out.println(" your triple target sum is :" +ans);
    }
}
