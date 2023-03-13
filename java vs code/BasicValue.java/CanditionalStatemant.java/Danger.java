import java.util.Scanner;

public class Danger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();

        // if (n % 15 == 0) { // ishme ham condition ese bhi de sakte the : (n%3==0 &&
        // n%5==0)
        // System.out.println("yes this number is divide by 3 and 5 :");
        // } else {
        // System.out.println("sorry this number is not divide by 3 and 5:");
        // }

        // if (n % 5 == 0 && n % 3 != 0 && n > 0) { // ishme ham condition ese bhi de
        // sakte the : (n%3==0 && n%5==0)
        // System.out.println("yes this number is divide by 5 and not divide by 3 :");
        // } else if (n % 5 == 0 && n % 3 != 0 && n < 0) { // ishme ham condition ese
        // bhi de sakte the : (n%3==0 && n%5==0)
        // System.out.println("this is negative number: ");
        // } else if (n % 5 == 0 && n%3!=0) {
        // if (n % 5 == 0 && n < 0 && n%3!=0)
        // System.out.println("sorry this is not devide by 5 because this is negative
        // numbar");
        // else {
        // System.out.println("yes this is divide by 5 but not divide by 3:");
        // }
        // }

        // else {
        // System.out.println("sorry this number is not divide by 5:");
        // }

        // if (n % 5 == 0) {
        // if (n % 5 == 0) {
        // System.out.println("yes this number is devide by only 5:");
        // } else if (n % 5 == 0 && n % 3 != 0 && n>0) {
        // System.out.println("yes this number is devide by 5 but not divide by 3: ");
        // } else if (n % 5 == 0 && n % 3 != 0 && n > 0) {
        // System.out.println(
        // "this number is divide by 5 and not divide by 3 but not access because this
        // is negative number : ");
        // }
        // } else {
        // System.out.println("sorry this number is not divide by 5: ");
        // }

        // if (n % 5 == 0 && n > 0) {
        // if (n % 3 != 0 && n > 0) {
        // System.out.println("this number divide by 5 and not divide by 3 ");
        // }
        // } else if ((n % 5 != 0) && n < 0) {
        // System.out.println("this is not divide by 5 and its nagative ");
        // } else if ((n % 5 != 0) && n > 0) {
        // System.out.println("this is not divide by 5 ");
        // } else {
        // System.out.println("this is divide by 5 but its negative:");
        // }

        if (n % 5 == 0 && n > 0) {
            if (n % 3 != 0 && n > 0) {
                System.out.println("this number divide by 5  and not divide by 3 ");
            } else {
                System.out.println("this number is divide by 3 and 5:");
            }
        } else if ((n % 5 != 0) && n % 3 != 0 && n < 0) {

            System.out.println("this is not divide by 5 and 3 andddd its nagative ");
        } else if ((n % 5 != 0) && n % 3 != 0 && n > 0) {
            System.out.println("this is not divide by  5 and 3   ");
        } else {
            System.out.println("this is divide by 5 but its negative:");
        }

    }
}