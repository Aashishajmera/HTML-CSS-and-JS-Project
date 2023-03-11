class ArrayExample { // its class name

    void singleArray() { // its mathod name

        int[] ages = new int[3]; // ages[0] , ages[1] , ages[2]
        float weights[] = new float[2];
        String[] names = new String[6]; // ise ham or dusre tarike se bhi likh sakte hain jese
        // string [] names ={"Aashish " "Deepak" "rohit" "vivek"} or inhe ham direct bhi
        // access kr sakte hai jese print krane ke lie
        // inhe diclare krne ki jarut nhi hai
        // System.out.println(names[0]);
        // System.out.println(names[1]);
        // System.out.println(names[2]);
        // System.out.println(names[3]);

        // agar inki length pta krna hai to
        System.out.println("length is:");
        System.out.println(ages.length); // ages ki length kitni hai and other ki
        System.out.println(weights.length);
        System.out.println(names.length);

        System.out.println();

        ages[0] = 34; // ye ages me value store kri than niche unhe print kraya
        ages[1] = 12;
        ages[2] = 45;

        System.out.println("ages is:");

        // print krane pr

        // System.out.println(ages[0]); // agar ishe while loop se print kre to
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);

        int i = 0;
        while (i<ages.length) {                                       // ishme bhi ham condition length me de sakte hai jese i<2 = i<ages.length
            System.out.println(ages[i]);
            i++;
        }

        System.out.println();

        weights[0] = 34.6f; // ye weights me value store kri than niche unhe print kraya
        weights[1] = 12.8f;

        System.out.println("weight is:");

        // System.out.println(weights[0]); // agar ishe for loop se print kre to essa
        // kuchh
        // System.out.println(weights[1]);

        for (int j = 0; j < 2; j++) {       // array ko traverse krne ke lie            // isme ham condition ko length me bhi likh sakte hai jese j<2; = j<weights.length
            System.out.println(weights[j]);
        }

        System.out.println();

        names[0] = "Aashish";
        names[1] = "rohit";
        names[2] = "vivek";
        names[3] = "bhumi bagwan{bittu ashish's love}";
        names[4] = "sunil";
        names[5] = "Deepak";

      

        // inhe ham ese bhi print kra sakte hai
        System.out.println("and than names is:");
        System.out.println(names[0]); // agar ishe for each loop se print kre to esa kuchh
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(names[5]);

        // for (String name : names) {
        //     System.out.println(name); 
        // }

    }





    void multiArray() {

        // int [][] ages =new int [4][3]; // ishe or bhi ek tarike se likh sakte hai
        // jese ishko declare krne ke lie ese krte hai

        // ages[0][0] =34;
        // ages[0][1]=12;
        // ages[0][2]=45;

        // ages[1][0] =3;
        // ages[1][1]=44;
        // ages[1][2]=6;

        // ages[2][0] =4;
        // ages[2][1]=1;
        // ages[2][2]=4;

        // ages[3][0] =54;
        // ages[3][1]=14;
        // ages[3][2]=4; // ab inhe print krne ke lie

        // System.out.println(ages[0][0]);
        // System.out.println(ages[0][1]);
        // System.out.println(ages[0][2]);
        // System.out.println(ages[1][0]);
        // System.out.println(ages[1][1]);
        // System.out.println(ages[1][2]);
        // System.out.println(ages[2][0]);
        // System.out.println(ages[2][1]);
        // System.out.println(ages[2][2]);
        // System.out.println(ages[3][0]);
        // System.out.println(ages[3][1]);
        // System.out.println(ages[3][2]);

        // second type me ese

        // esse me second method easy hai

        int[][] ages = { { 23, 44, 55 }, { 3, 5, 7 }, { 43, 56, 22 }, { 4, 66, 2 } }; // ishme hamne yahi pr declare kr
                                                                                      // diya hain

        // System.out.println(ages[0][0]);        // agar ishe loop se print kre to 
        // System.out.println(ages[0][1]);
        // System.out.println(ages[0][2]);
        // System.out.println(ages[1][0]);
        // System.out.println(ages[1][1]);
        // System.out.println(ages[1][2]);
        // System.out.println(ages[2][0]);
        // System.out.println(ages[2][1]);
        // System.out.println(ages[2][2]);
        // System.out.println(ages[3][0]);
        // System.out.println(ages[3][1]);
        // System.out.println(ages[3][2]);

        // for(int k=0; k<4; k++){                      // agar ishe ham langth me condition de kr print krae to 
        //     for(int l=0; l<3; l++){
        //         System.out.println(ages[k][l]);
        //     }
        // }


            // condition ko length me dene se bar bar jese hamne pehle 4 row and 3 colomn ka bnaya tha or bad me change kiya to agar condition length me di gai hai to hame condition bar bar change krne ki jarurat nhi padti hain 
// mtlab ki difrent length wala array bhi print kra sakte hai bina kisi condition change kiye bina :!!


         for(int k=0; k<ages.length; k++){                               // bahar wale loop ke lie  bole to 4 row ke lie    
            for(int l=0; l<ages[k].length; l++){                       // andar wale loop ke lie bole to 3 colomn ke lie 
                System.out.println(ages[k][l]);
            }
        }



    }

}

public class Array2Loop {
    public static void main(String[] args) {

        ArrayExample obj1 = new ArrayExample(); // class ka name bna kr
         obj1.singleArray(); // object ko call kiya
         obj1.multiArray();

         // ek class ka ek bar object bnao or ush class ki other mathod ko us ek hi object se call kr sakte hai jese ishme kiya hai
    }

}
