import java.util.Scanner;

public class multipleOf {
    public static void main(String[] args) {

        int i = 1;

        while (true) {

            if ((i % 5 == 0) && (i % 7 == 0)) {

                System.out.println("found ans is " + i);
                break;                                         // agar ishme break keyword nhi lagaenge to ye bahut se ans ko print krega
            }

            i++;

        }

    }
}
