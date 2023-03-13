import java.util.Scanner;

public class TrueFalse {

   

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("enter " + n + " element");      

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();

        }
        boolean ans=true;
        
        int[] arr2 = new int[n];

        // copyarray(arr1);
       System.out.println("enter second array size");
       n=sc.nextInt();
       System.out.println("enter " + n + " element");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
            if(arr1[i]!=arr2[i]){
                ans=false;
                
                 }
        }
        // copyarray(arr2);
        System.out.println(ans);
       

    }
}
