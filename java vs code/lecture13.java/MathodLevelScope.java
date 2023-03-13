class Algebra{

    int add(){
        int p=10;           //mathod level scope hai     //yaha jo variable hai unka use ham only add name ki mathod me hi kr sakte hai sub name ki ya other  mathod me nahi kr sakte han ishi ko matod level scope kahhte hai 
        int q=4;                                    // dusre variable bna lenge p and q name se or wo ish lie bna paenge kyoki ham dusri mathod me bnaege 
        return p+q;                  // because ham ek mathod me ek jese name ke do variable nhi rakh sakte hai lekin alag alag class me rakh sakte hain 
    }                               // for example 

    int sub(){
        int p=3;
        int q=2;
        return p-q;
    }
    // int sub(){
    //     return p-q;         // agar ye p and q class ke pass initilize krte to inhe ham kahi bhi access kr sakte the 
    // }
}


public class MathodLevelScope {
    public static void main(String[] args) {
        
    }
}
