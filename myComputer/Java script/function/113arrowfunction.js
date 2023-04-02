// without () but parameter die hue hai 
const sqr1 = x => {
    return x*x;
}

// calling
let sqr1_print = sqr1(33);
console.log(sqr1_print);


// 1st arrow function 
const sqr = (x) => {
    return x*x;
}

// output print krane ke tarike

// 1st tarika 
console.log(sqr(3));

// second tarika 
let sqr_output = sqr(4);        // अधिकतर 3rd varible ka use tab krte hai jab function me return statement ka upyog kiya gya ho 
console.log(sqr_output);

// 3rd 
let output = 9;        // if array ke lie print krate to [] use kr ke value dete 
console.log(sqr(output));




// 2nd arrow ya fat function bnane pr
const addition = (x,y) => {
    let add = x + y ;
    console.log(add);
}
// if return statement lgate to ham ishe without 3rd varible ke print nhi kra sakte the  LEKIN without return satement wale function ko 3rd varible ke bhi print kra sakte hai OR string value me bhi kr sakte hai dono tariko se 3rd varible se or without 3rd varible ke bhi !!



// or ishe bhi print krane ke bahut tarike hai 
// calling 
addition(9,8);


/* Device name	DESKTOP-LOVERBOY
Processor	Intel(R) Core(TM) i5-6300U CPU @ 2.40GHz   2.50 GHz
Installed RAM	8.00 GB (7.88 GB usable)
Device ID	3DC4AA43-6014-4F58-867B-D69B18CF8C9D
Product ID	00330-50534-35210-AAOEM 
System type	64-bit operating system, x64-based processor
Pen and touch	Touch support with 10 touch points
 */


// 3rd arrow function
const sum = (x, y) => {
    let sum_output = x + y ;
    console.log(`adding ${x} and ${y}`);
    console.log('adding ' + x + ' and ' + y);
    console.log('adding',x ,'and' ,y);        // ishka use nhi krte hai because ishme x and y ki value print hoti hai 
    return sum_output ;
}

// calling
let summmmm = sum(4 , 8);
console.log(summmmm);


// second tarike se try krne pr 
// const sum = () => {
//     let num1 = 3;
//     let num2 = 4;
//     let sum_output = num1 + num2 ;
//     console.log(`adding ${x} and ${y}`);
//     console.log('adding ' + x + ' and ' + y);
//     console.log('adding',x ,'and' ,y);
//     return sum_output ;
// }

// // calling
// let summmmm = sum();
// console.log(summmmm);



// if string print krna ho to () ke andar value dete hai jese ki 

const string_type = (x,y) => ({
    sum: x+y , diffrance: x-y
})

// calling 
// 1st tarike se 
let string_output = string_type(8,9);
console.log(string_output);

// second tarike se 
console.log(string_type(6,8));

let sss = string_type(3,5)




// without parameter ke 
const variable_name__ = (x, y) => {
    console.log("hello bro");
    return x*y;
}

console.log(variable_name__(9,8));
