import java.util.Scanner;

public class PositiveValue {


    static void sum(int[] arr){
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        
        
        
        }
    }



    public static void main(String[] args) {
        
        // int [] arr = {2,6,-5,-1,0,4,-9};
        
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i])
        //     System.out.println(arr[i]);
        // }

        // for(int val:arr){
        //     if(val=>0){
        //         System.out.println(val);
        //     }
        // }

        // String [] arr ={"ab" , "cd" , "ef" , "gh" , "ij" , "kl" , "mn"};

        // for(int i=0; i<arr.length; i++){
        //     if(i%2 != 0){
        //         System.out.println(arr[i]);
        //     }
        // }


        // int [] arr = {2,3,4,5,6,7,8,};

        // sum(arr);          // ishko hamne mathod bna ke call kiya hai and second type 


             // int [] arr = {2,3,4,5,6,7,8,};
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]%2==0){
        //         System.out.println(arr[i]);
        //     }
        
        
        
        // }                      // third mathod 

        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size:");
        int size=sc.nextInt();
        System.out.println("enter " + size + " element:");
        int [] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("even element is: ");
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
               
                System.out.println( +arr[i]);
            }
        
        
        
        }




    }
}
