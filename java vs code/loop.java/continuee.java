public class continuee {
    public static void main(String[] args) {
        

       myloop: for(int i=1; i<=31; i++){
            if(i%7==0){
                continue myloop;
                                                    //ishme hamne loop ko name de diya my loop jisse continue statment ko pta chla ki kon se loop ko continue krna hai kher ishme to ek hi loop hai to agar name na bhi de to chalega ishka use nested loop pe hoga 
            }
            System.out.println(i);
            
        }





    }
}
