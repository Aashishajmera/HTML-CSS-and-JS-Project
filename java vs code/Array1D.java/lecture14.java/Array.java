class ArrayExample {                 // its class name

    void singleArray(){              // its mathod name

        int [] ages =new int [3];                // ages[0] , ages[1] , ages[2]
         float weights []=new float[2];
        String [] names = new String[6];    // ise ham or dusre tarike se bhi likh sakte hain jese  
        // string [] names ={"Aashish " "Deepak" "rohit" "vivek"}   or inhe ham direct bhi access kr sakte hai jese print krane ke lie
        //inhe diclare krne ki jarut nhi hai 
        // System.out.println(names[0]);
        // System.out.println(names[1]);
        // System.out.println(names[2]);
        // System.out.println(names[3]);


        //agar inki length pta krna hai to 
        System.out.println("length is:");
        System.out.println(ages.length);               // ages ki length kitni hai and other ki 
        System.out.println(weights.length);
        System.out.println(names.length);

        System.out.println();





        ages[0] =34;          // ye ages me value store kri than niche unhe print kraya
        ages[1]=12;
        ages[2]=45;

        System.out.println("ages is:");

        System.out.println(ages[0]);               // print krane pr 
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println();

        weights[0] =34.6f;          // ye weights me value store kri than niche unhe print kraya
        weights[1]=12.8f;
       
        System.out.println("weight is:");
        System.out.println(weights[0]);
        System.out.println(weights[1]);

        System.out.println();

        names[0]="Aashish";
        names[1]="rohit";
        names[2]="vivek";
        names[3]="tatu ji";
        names[4]="sunil";
        names[5]="Deepak";

        System.out.println("and than weight is:");

        System.out.println(names[0]);       // inhe ham ese bhi print kra sakte hai 
        System.out.println(names[1]);       
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(names[5]);




    }



    void multiArray(){


        //  int [][] ages =new int [4][3];       // ishe or bhi ek tarike se likh sakte hai jese          ishko declare krne ke lie ese krte hai 

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
        // ages[3][2]=4;      // ab inhe print krne ke lie 
           

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


        //second type me ese
        
        // esse me second method easy hai 




        int [][] ages = {{23,44,55},{3,5,7},{43,56,22},{4,66,2}};        // ishme hamne yahi pr declare kr diya hain 

         System.out.println(ages[0][0]);
        System.out.println(ages[0][1]);
        System.out.println(ages[0][2]);
        System.out.println(ages[1][0]);
        System.out.println(ages[1][1]);
        System.out.println(ages[1][2]);
        System.out.println(ages[2][0]);
        System.out.println(ages[2][1]);
        System.out.println(ages[2][2]);
        System.out.println(ages[3][0]);
        System.out.println(ages[3][1]);
        System.out.println(ages[3][2]);
        

    }




}

public class Array {
    public static void main(String[] args) {

        ArrayExample obj1 =new ArrayExample();              // class ka  name bna kr 
       obj1.singleArray();                               // object ko call kiya 

      ArrayExample obj2 =new ArrayExample(); 
        obj2.multiArray();


    }

}
