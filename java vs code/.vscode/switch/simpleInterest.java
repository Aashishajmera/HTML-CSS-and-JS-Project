import java.util.Scanner;

public class simpleInterest {
        public static void main(String[] args) {

                float p;
                float r;
                float t;
                float si;

                System.out.println(
                                "enter your case 1: yearly , case 2: monthly , case 3: daily , case 4: year and month, case 5: month and day , case 6: year and day, case 7: year month and day ");
                Scanner sc = new Scanner(System.in);
                int simpleInterest = sc.nextInt();
                switch (simpleInterest) {

                        case 1:

                                System.out.println("yearly");

                                System.out.println("enter principale");
                                p = sc.nextFloat();

                                System.out.println("enter rate of interest");
                                r = sc.nextFloat();

                                System.out.println("enter rate of time");
                                t = sc.nextFloat();

                                float ysi = (p * r * t) / 100 * 12;

                                System.out.println("simple interest is " + ysi);

                                break;

                        case 2:

                                System.out.println("monthly");

                                System.out.println("enter principale");
                                p = sc.nextFloat();

                                System.out.println("enter rate of interest");
                                r = sc.nextFloat();

                                System.out.println("enter rate of time");
                                t = sc.nextFloat();

                                float msi = (p * r * t) / 100;

                                System.out.println("simple interest is " + msi);

                                break;

                        case 3:

                                System.out.println("daily");

                                System.out.println("enter principale");
                                p = sc.nextFloat();

                                System.out.println("enter rate of interest");
                                r = sc.nextFloat();

                                System.out.println("enter rate of time");
                                t = sc.nextFloat();

                                float dsi = (p * r * t) / 100 / 31;

                                System.out.println("simple interest is " + dsi);

                                break;

                        case 4:

                                System.out.println("yearly");

                                System.out.println("enter principale");
                                p = sc.nextFloat();

                                System.out.println("enter rate of interest");
                                r = sc.nextFloat();

                                System.out.println("enter rate of time");
                                t = sc.nextFloat();

                                float ytsi = (p * r * t) / 100 * 12;

                                System.out.println("simple interest is " + ytsi);

                                System.out.println("monthly");

                                System.out.println("enter principale");
                                p = sc.nextFloat();

                                System.out.println("enter rate of interest");
                                r = sc.nextFloat();

                                System.out.println("enter rate of time");
                                t = sc.nextFloat();

                                float mtsi = (p * r * t) / 100;

                                System.out.println("simple interest is " + mtsi);

                                System.out.println("your total interest is" + (ytsi + mtsi));

                                break;

                        case 5:

                                System.out.println("monthly");

                                System.out.println("enter principale");
                                p = sc.nextFloat();

                                System.out.println("enter rate of interest");
                                r = sc.nextFloat();

                                System.out.println("enter rate of time");
                                t = sc.nextFloat();

                                float monthtosi = (p * r * t) / 100;

                                System.out.println("simple interest is " + monthtosi);

                                System.out.println("daily");

                                System.out.println("enter principale");
                                p = sc.nextFloat();

                                System.out.println("enter rate of interest");
                                r = sc.nextFloat();

                                System.out.println("enter rate of time");
                                t = sc.nextFloat();

                                float daytosi = (p * r * t) / 100 / 31;

                                System.out.println("simple interest is " + daytosi);

                                System.out.println("your principal rate and time is " + p + r + t);

                                System.out.println("your total ans is" + (monthtosi + daytosi));

                                break;

                        case 6:

                                System.out.println("yearly");

                                System.out.println("enter principale");
                                p = sc.nextFloat();

                                System.out.println("enter rate of interest");
                                r = sc.nextFloat();

                                System.out.println("enter rate of time");
                                t = sc.nextFloat();

                                float yysi = (p * r * t) / 100 * 12;

                                System.out.println("simple interest is " + yysi);

                                System.out.println("daily");

                                System.out.println("enter principale");
                                p = sc.nextFloat();

                                System.out.println("enter rate of interest");
                                r = sc.nextFloat();

                                System.out.println("enter rate of time");
                                t = sc.nextFloat();

                                float ddsi = (p * r * t) / 100 / 31;

                                System.out.println("simple interest is " + ddsi);

                                System.out.println("your total interest is " + (yysi + ddsi));

                                break;

                        case 7:

                                System.out.println(" firstly year  secondly month therdly day");

                                System.out.println("yearly");

                                System.out.println("enter principale");
                                p = sc.nextFloat();

                                System.out.println("enter rate of interest");
                                r = sc.nextFloat();

                                System.out.println("enter rate of time");
                                t = sc.nextFloat();

                                float yearsi = (p * r * t) / 100 * 12;

                                System.out.println("simple interest is " + yearsi);

                                System.out.println("monthly");

                                System.out.println("enter principale");
                                p = sc.nextFloat();

                                System.out.println("enter rate of interest");
                                r = sc.nextFloat();

                                System.out.println("enter rate of time");
                                t = sc.nextFloat();

                                float monthsi = (p * r * t) / 100;

                                System.out.println("simple interest is " + monthsi);

                                System.out.println("daily");

                                System.out.println("enter principale");
                                p = sc.nextFloat();

                                System.out.println("enter rate of interest");
                                r = sc.nextFloat();

                                System.out.println("enter rate of time");
                                t = sc.nextFloat();

                                float daysi = (p * r * t) / 100 / 31;

                                System.out.println("simple interest is " + daysi);

                                System.out.println("your principal rate and time is " + p + r + t);

                                System.out.println("your total ans is " + (yearsi + monthsi + daysi));
                                break;

                        default:

                                System.out.println("no found");

                }

        }

}

