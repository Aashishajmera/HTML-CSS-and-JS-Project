import pw.skills.Appp; // ishme ham Appp ke jagah pr * bhi likh sakte hai jisse ham pw skills ke sabhi class ko access kr sakte hai

public class OutSidePwSkills {
    public static void main(String[] args) {

        Appp obj1 = new Appp();
        System.out.println("outside package , non child class " + obj1.str_1);

        App3 obj3=new App3();
        obj3.printFromClass();

    }
}

// child class // parant class ki
class App3 extends Appp {
    void printFromClass() {
        App3 obj3 = new App3();
        System.out.println("child class " + obj3.str_1);
    }

}