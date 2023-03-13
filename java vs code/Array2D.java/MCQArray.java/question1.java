import java.util.Scanner;

  


public class question1 {

    static int countOccurrences(int[] Input, int x ){
        int count =0;
        for(int i=0; i<Input.length; i++){
            if(Input[i]==x){
                count++;
            }
        }
        return count;
    }

    static int lastOccurrences(int [] Input , int x){
        int lastIndex = -1;

        for(int i=0; i<Input.length; i++){
            if(Input[i]==x){
                // System.out.println(+lastIndex);
                lastIndex =i;
            }
        }
        return lastIndex;
        
    }

    static int IncressValue(int [] Input, int x){
        int IncressValue=0;
        for(int i=0; i<Input.length; i++){
            if(Input[i]>x){
                IncressValue++;
            }
        }
        return IncressValue;
    }


    static boolean isshort(int [] Input){
        boolean check=true;
        for(int i=1; i<Input.length; i++){
            if(Input[i]<Input[i-1]){
                //not shorted
                check=false;
                break;
            }
        }
            return check;
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
        // System.out.println("enter x");
        // int x=sc.nextInt();
            
        // System.out.println("count of x:"+countOccurrences(Input, x));
        // System.out.println("last index is:" +lastOccurrences(Input, x));
        // System.out.println("Incress value is:" + IncressValue(Input, x));
       System.out.println("is shorted :" +isshort(Input));

      
    }
}
