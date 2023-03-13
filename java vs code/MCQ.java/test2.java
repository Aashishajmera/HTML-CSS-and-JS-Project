public class test2 {


    public static int helper(int p)
    {
        int q=6; 
         p=p+5;
        return p;

    }   
    
    public static void main(String[] args) {
        
        int q=0;
        int p=10;

        System.out.println(helper(q)+" "+helper(p));

    }
}

