import java.util.Scanner;

  


public class TakingInput {


    static void copyArray(int[] Input){                     // ye mathod ishlie bnai hai because hame bar bar print krane wala for loop print na krana pde

        for(int i=0; i<Input.length; i++){
            System.out.print(Input[i]+" ");
        }
        System.out.println();
    }




    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();

        int Input[] = new int[size];

        System.out.println("enter " + size + " element");
       

        for (int i = 0; i < Input.length; i++) { // ye kitne input lena hai ish ke lie loop lgaya hai
            Input[i] = sc.nextInt();
           

        }

        for (int j = 0; j < Input.length; j++) {         // ham ye for loop ki jagah pr copyArray name ki mathod ko call kr sakte hai        // size ko Input.lenght bhi likh sakte hai !! // or ye jo input liya hai use
                                         // print krane ke lie !!

            System.out.print(Input[j] + " ");
            // System.out.print(" "); // ye input ko hamne upar bhi print kr liya hai ish
            // lie ishe comment kiya hain
        }

        //  ish pure loop ki jagah pr ham sidhe ush copy mathod ko call kr sakte hai jese ish upar wale loop ki jagah pr ham 
            System.out.println();
        copyArray(Input);          // ishka use bhi kr sakte hai 

        System.out.println("done");

        // trying to copy input to input_2

        int input_2[] = Input;
        copyArray(input_2 );         // ye hamne direct call kr ke input ki copy bna li agar ham copyArray name ki mathod nhi bnate to hame for 
     

    }
}
