import java.util.*;

class Algebra {

    int a;
    int b;

    Algebra(int x, int y) { // ye Algebra class ka constructor bnaya hain
        System.out.println("constructor of Algebra called ");

        a = x;
        b = y;

    }

    int add() { // mathod name add hai
        int ans = a + b;
        return ans;
    }

    int sub() {
        int ans = a - b;
        return ans;
    }

    int mul() {
        int ans = a * b;
        return ans;
    }
}

public class calculatorr {
    public static void main(String[] args) { // yah main mathod hai
        Algebra obj1 = new Algebra(5, 7); // algebra class ka object bnaya
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter a first number:");
        // int x = sc.nextInt();
        // System.out.println("enter a second number:");
        // int y = sc.nextInt();

        System.out.println("sum of input number is");

        // System.out.println(obj1.add(x, y)); // ishko ham ese bhi likh sakte hai

        int ans = obj1.add();
        System.out.println(ans); // System.out.println(obj1.add()); esa bhi likh sakte the apan
        System.out.println(obj1.sub());
        System.out.println(obj1.mul());

        Algebra obj2 = new Algebra(9, 5);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());

    }
}
