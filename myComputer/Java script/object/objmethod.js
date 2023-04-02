// create object 

let obj = { id: 100 , name: 'Aashish', village: "Aamla"}
console.log(obj);

// if koi shi key delete krna ho to
delete obj.id;
console.log(obj);

// if object ki key dekhna ho to 
Object.keys(obj);     // ese value dekhte hai 
console.log(Object.keys(obj));    // value dekhne ke sath hi value print bhi 

 // ya phir 3rd varible se  dekh sakte hai 
let varible_name = Object.keys(obj);
console.log(varible_name);

// if object ki value dekhna ho to same wo hi tarike hai 
Object.values(obj);   
console.log(Object.values(obj));  //3rd varible se bhi kr sakte the 

// if dono ko sath hi check krna hai to 
console.log(Object.entries(obj));

// other value ko add krne , update ,delete sabhi ko rokne ke lie 
// Object.freeze(obj);    //kuch bhi changes nhi honge (freeze) se 
// ab add krne pr 
obj.salary = 12000;
console.log(obj);    // kuchh bhi privrtan nhi huaa

// if only update allow krne krna hai to
Object.seal(obj);   // addition and deletion nhi hoga  only update hi hoga (seal) se 
obj.name = "vivek";
console.log(obj);

// kisi object ki value ko new object me dalna ho to 
let obj_name = Object.assign({} , obj);    // ish object me value add krna ho to {value de do ish breses me }
console.log(obj_name);