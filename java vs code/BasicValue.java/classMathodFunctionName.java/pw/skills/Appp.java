package pw.skills;

import javax.sound.midi.Soundbank;

public class Appp {
    public String str_1 = "i am a public member";

    void printFromClass() {
        System.out.println("within class:" + str_1);
    }

    public static void main(String[] args) {
        Appp obj1 = new Appp();
        obj1.printFromClass();
        System.out.println("with in  classs " + obj1.str_1);
        System.out.println();
        App2 obj2 = new App2();
        obj2.printFromOutSideClass();

    }

}

class App2 {

    void printFromOutSideClass() {
        Appp obj1 = new Appp();
        System.out.println("within package , outside class:" + obj1.str_1);
        System.out.println();
    }

}