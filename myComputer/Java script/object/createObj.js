// object creating

// frist and simple way to declare object 
let obj = { id: 1 , name: "Aashish", salary: 120000}
obj.address = "Aamla"
console.log(obj);


// second way to object declare
let obj1 = new Object();
// adding value 
obj1.id = 111;
obj1.name = "Vivek"
obj1.salary = 80000;
// print value
console.log(obj1);

// 3rd way to declare object 
function obj2(i , n , s){
    this.id = i;
    this.name = n;
    this.salary = s;
}
obj2(12, "aashish", 1200000);


// loop lgane pr but it's not working 

// function obj2(){
//    for(let i=0; i<arguments.length - 1; i++){

//    }
// }



let output = new obj2(12, "Aashish", 1200000);
console.log(output);



// value ko add krne ke bhi 2 tarike hai 
// 1st
obj.friend = "vivu";
console.log(obj);

// 2nd 
obj['friend'] = "Rohit";
console.log(obj);


// 2 tarike se value ko fatch kr sakte hai 
// 1st
console.log(`the id value is ` , obj.id);
console.log(obj.name);
console.log(obj.salary);


// 2nd
console.log(obj['id']);
console.log(obj['name']);


// value ko update krne ke lie 
obj1.id = 33;
console.log(obj1);

obj1["name"] = "pappu";
console.log(obj1);


// if koi si key vlaue kp delete krna hai to 

delete obj.name
console.log(obj);

// jo object function se create kiya hai ushme extra value add nhi kr sakte syd , or syd loop se ho bhi sakta hai 
// jese ishme obj2 ko function se create kiya hai 
// obj2.relationship = "jaan";
// console.log(obj2);