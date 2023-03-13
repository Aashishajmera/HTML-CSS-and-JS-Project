 class student {                // student ke lie ek alag class bnai ek file me do class nhi ho sakti hai   !! 
                                // yah class student ka kam karegi mtlab student ki information !! 
    int rollNo;
    String studentName;
}




public class Main {
    public static void main(String[] args) {                // main mathord ke lie hamne ek alag class bnai hai 
                                                                // yahn main mathord ka kaam karegi !!
        student obj1 = new student();
        obj1.rollNo =1;
        obj1.studentName="Aashish";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);              // ek hi class ke multipul object bna sakte hai jse ish program me obj1 and obj2 bnaya hai

        student obj2 = new student();
        obj2.rollNo =2;
        obj2.studentName="vivek";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.studentName);



    }
}