public class ASCII {
    public static void main(String[] args) {

        char ch = 'a';
        System.out.println(ch);

        int x = (int) ch; // eshe inki cassivalue nikalte hai ..........
        System.out.println(ch + " ASCII VALUE IS: " + x);
        System.out.println();

        char kl = 'A';
        System.out.println(kl);

        int y = (int) kl; // eshe inki cassivalue nikalte hai ..........
        /*
         * ye java language hai to ishme ham int ka use na bhi kre to bhi ho jaega jese
         * int y = kl;
         * all the above  none of the above
         */
        System.out.println(kl + " ASCII VALUE IS: " + y);
        System.out.println();

    }

}
