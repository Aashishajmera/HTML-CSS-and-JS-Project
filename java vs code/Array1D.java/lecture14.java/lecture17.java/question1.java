public class question1 {

    // static void changevalue(int a, int b) {

    //     a = 9;
    //     b = 3;

    //     System.out.println("without change value:");
    //     System.out.println("a:" + a);
    //     System.out.println("b:" + b);

    //     System.out.println("change value:");
    //     int temp = a;
    //     a = b;                           // swaping value:
    //     b = temp;

    //     System.out.println("a: " + a);
    //     System.out.println("b:" + temp);

    // }

    // public static void main(String[] args) {

    //     int a=9;
    //     int b=3;

    //  changevalue(a, b);


    static void changevalue(int a, int b) {

        a = 9;
        b = 3;

        System.out.println("without change value:");
        System.out.println("a:" + a);
        System.out.println("b:" + b);

        System.out.println("change value:");
        a= a+b;          // yah right to left work krta hai jese ishme pahle b+a hoga or phir wo a me jaega 
        b=a-b;          // ishme hamnee bina third variable bnae value ko change kr diya 
        a=a-b;
        System.out.println("a: " + a);
        System.out.println("b:" + b);

    }





  



    public static void main(String[] args) {

    //     int a=9;
    //     int b=3;

    //  changevalue(a, b);
    }
}
