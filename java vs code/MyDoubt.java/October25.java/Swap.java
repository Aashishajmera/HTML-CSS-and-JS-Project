public class Swap {
    public static void main(String[] args) {

        int temp = 0;
        int a = 20;
        int b = 10;

        // Swap mathord use 3rd variable:
        // temp = a;
        // a = b;
        // b = temp;

        // Swap mathord without use 3rd variable:

            a=a+b;
            b=a-b;
            a=a-b;

            // ya phir

            // b=a+b;
            // a=b-a;
            // b=b-a;

        System.out.println(a);
        System.out.println(b);

    }
}
