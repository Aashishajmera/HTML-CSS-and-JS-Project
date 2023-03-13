 class demoooo { // yah class hain

    void demo() { // yah mathod hain

        int a = 10;
        System.out.println(+a);
        // System.out.println(+b); // ishko yaha access nhi kr sakte because B ko

        for (int i = 0; i <= 6; i++) // ish i ko bhi ham only inchi wale carli brases me hi print kra sakte hain unke
                                     // bahar nhi
        {
            int b = 23; // yaha pr declare kiya hai ishko sirph in crli brases ke bich me hi print kra
                        // sakte hain
            System.out.println(+b);
            System.out.println(+i); // ish i ko ham in brases ke bahar print nhi kra sakte hain jese
        }

        // System.out.println(+i); // yaha pr hahamne i ko print krne ki kosis ki lekin
        // kr nhi pae na chahe to comment hta kr dekh lo

        // System.out.println(+b); // crli brases ke bahar bhi nhi kr sakte

        for (int i = 1; i <= 2; i++) {
            int b = 100; // hamne ek hi calsss me ek jese do variable declaire kr die because ye alag
                         // alag crli brases me hai crli brases bole to block {}
            System.out.println(+b);
        }

    }

}

public class BlockLevelScope {
    public static void main(String[] args) {
        demoooo obj1 = new demoooo();
        obj1.demo();

    }

}
