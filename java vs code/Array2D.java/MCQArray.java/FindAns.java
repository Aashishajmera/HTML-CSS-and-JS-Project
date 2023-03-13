import java.util.Scanner;

import javax.lang.model.SourceVersion;

public class FindAns {

    static int findanss(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }

            }

        }
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
                System.out.println("Unique element is:" +ans);
            }

        }
return ans;
       
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("enter " + size + "element ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

    findanss(arr);

        // System.out.println("unique element:"+findanss(arr));        //ishe ham niche likha esa bhi likh sakte hain

       

    //    int ans= findanss(arr);
    //     System.out.println(" the unique element is: " +ans);
    }
}
