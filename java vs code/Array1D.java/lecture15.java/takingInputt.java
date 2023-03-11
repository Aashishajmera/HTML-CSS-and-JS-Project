import java.util.Arrays;
import java.util.Scanner;

  


public class takingInputt {


    static void copyArray(int[] Input){                     // ye mathod ishlie bnai hai because hame bar bar print krane wala for loop print na krana pde

        for(int i=0; i<Input.length; i++){
            System.out.print(" "+Input[i]+" ");
        }
        System.out.println();
    }




    public static void main(String[] args) {

       
        int Input[] = new int[5];


        Input[0]=2;
        Input[1]=3;
        Input[2]=4;
        Input[3]=5;
        Input[4]=6;

        System.out.println("original input array");
        copyArray(Input);
        System.out.println();


        // int input_2[]=Input;                             // yaha pr clone mathod ko use krna hai, agr dono mathod ki value ko change nhi krna hai to , change value ko ushi ek mathod me change krna ho to jesa niche kiya hai 
        // int input_2[]=Input.clone();                       // ish clone ki jagah pr ham ek mathod ka use or bhi kr sakte the jese 
         int input_2[]=Arrays.copyOf(Input,Input.length);       // Array.copyof and ishme do parameter pass krna pdta hai ek konsa array aapko copy krna hai or kitna langth ki copy bnana hai 

// ishme ham koi particular range bhi de sakte hai jese ishi second input_2 me dete hain 

        // int input_2[]=Arrays.copyOfRange(Input, 1, 3);     // to ye print krega ki input_2 class me input ke only 1 se 3 tak ke index copy kre 0 and 3 ans 4 ko print na kre 

        System.out.println("copy array  input_1");
        copyArray(input_2);
        System.out.println();

        //ab agar hame input_2 ke kuchh element ko change krne ke lie !!

        input_2[0]=8;
        input_2[1]=88;          //ishme hamne input_2 ko change kra hai but print krne pr input_1 bhi change ho gya hai !!
                                // because jab ham array me kisi ki bhi value ko change krte hai to ush array ka address to same hi hota hai
                                //ish lie input_2 ko change krne ke baad input_2 ke sath sath input_1 bhi change ho gya !!   
                                // because ishme refrence ki copy banti hai actual array ki copy nhi banti !! 
                                // or ishe ham sallow copy bhi kahte hai !!
                                // lekin yadi hame ishe change krna hai to ham ek mathod ko call kr sakte h jishka name hai clone jese 
                                // input_2 ko comment krke likha hai yadi comment hta de to dono me value change ho jaegi 


        System.out.println("original array in input_1 ");
        copyArray(Input);


        System.out.println("changable input_2 in input_1");
        copyArray(input_2);


        }
}
