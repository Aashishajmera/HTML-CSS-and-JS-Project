let arr = [2, 4, 5, 7, 9];
console.log(arr);

// last me value add krna ho to
arr.push(33, 55);
console.log(arr);

// last se value htana ho to
arr.pop(); // multipul bhi hta sakte hai  jese or htana hai to arr.pop(); ishe or lga do
console.log(arr);

// starting me se value htana ho to
arr.shift();
console.log(arr);

// starting me value add krna ho to
arr.unshift(22, 44);
console.log(arr);

// 2 array ko + kr ke ek thisra array bnana ho to
let arr1 = [11, 22, 33, 44];
let arr2 = [55, 66, 77, 88];
let arr3 = arr1.concat(arr2);
console.log(arr3);

// thisre array ko without [] ke print krana ho to ya yu kahe ki array ko string me convert krne pr 

let array_convert_string = arr3.join("");
console.log(array_convert_string);

// kisi array me koi si value add krna ho kahi pr bhi or kisi element ko delete krna ho to ya nhi bhi krna ho to
// jese convert array me change krne pr 

arr1.splice(1, 0, 99,222, 55);
console.log(arr1);

// ek element delete kr ke 4 element add krne  pr 
arr2.splice(2, 1, 3333, 5555, 000, 9);
console.log(arr2);

// ek new array return krna given array me se 
let arr4 = arr2.slice(2, 5);
console.log(arr4);    



// kisi perticular element ka index dekhna hai to 
console.log(arr2.indexOf(3333));