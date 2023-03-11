public class change {


    static void print_Array(int[] arr_1){                     // ye mathod ishlie bnai hai because hame bar bar print krane wala for loop print na krana pde

        for(int i=0; i<arr_1.length; i++){
            System.out.print(arr_1[i]+ " ");
        }
        System.out.println();
    }



    static void change_array(int[] arr_1) {
        for (int i = 0; i < arr_1.length; i++) {
            arr_1[i] = 0;
        }

    }

    public static void main(String[] args) {

        int[] arr_1= new int[3]; // ya
        // int [] arr={2,3,5,6,};

        arr_1[0]=1;
        arr_1[1]=3;
        arr_1[2]=5;

// print krane ke lie loop lgana pdta but hamne mathod bnai hai to mathod ko call kr dete hai !!

        change_array(arr_1);                    // ishme hamne value ko change kr diya hai to bhale hi hamne arr_1 ya arr_2 and arr_3 
                                                // me hamne jo bhi declare kiya hai usse koi matlab nhi hai because value change hon gayi hai !!
                                                // ish lie hame value change mili !!
        print_Array(arr_1);



    }
}
