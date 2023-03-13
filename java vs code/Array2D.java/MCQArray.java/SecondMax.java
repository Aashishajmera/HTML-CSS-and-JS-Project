import java.util.*;

public class SecondMax {                                                                  //yadi max ki value nikalna hai to -∞ agar min ki value nikalna hai to +∞

    static int findmaxvalue(int[] arr) {

        int size = arr.length;
        int max = Integer.MIN_VALUE;                           // max equeal rkha mtlab -∞    lekin ye sab man rkhne pr hota hai real me inki value hoti hai =>     // kul mila ke minimum ki value -∞ or maximum ki value +∞  hoti hai 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int SecondMaxValue(int[] arr){
        int max =findmaxvalue(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                arr[i]= Integer.MIN_VALUE;
            }
        }
        int SecondMaxValue =findmaxvalue(arr);
        return SecondMaxValue;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("enter " + size + " element");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        int ans = findmaxvalue(arr);
        System.out.println(" highest value is: " + ans);

        System.out.println("second maximum value:" +SecondMaxValue(arr));

    }
}
