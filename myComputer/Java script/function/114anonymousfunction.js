// anonymous function or iife(immedeately invoke function expression (inhe self invoke function bhi kahte hai )) function ko ham function expression kahte hai yah do tarike ki hoti hai named expression and without named expression  !!

// anonymous function ko ek variable me store kiya jata hai ishka koi name nhi hota de bhi sakte hai or inhe variable ke name se call kiya jata hai 
let variable_name = function () {
    console.log("I am Happy:");
}

// variable name se calling  vese anonymouse function ko variable name se hi call kiya jata hai 
variable_name();

// second anonymous function with parameter !!
let variable_name2 = function (x) {
    console.log(x*x);
}

variable_name2(3);

// 3rd anonymous function with default parameter !!
let variable_name3 = function (x=9) {
    return x*x;
}

let variable_name3_output = variable_name3(7);
console.log((variable_name3_output)); 




// immediately invoke  ya (self invoke) (IIFE)  function bhi kahte hai . ishe () se rape kiya jata hai aage ya pichhe kahi bhi kr sakte hai 

// 1st tarike se 
(function function_name(){
    console.log("I think i like him");
    // return "i think i forget"
})();      // (); se calling krne pr 



// 2nd tarike se with default value   if parameter 1 se adhik hai to or yadi default value dena ho to right side se dete hai 
(function funciton_name2(x=4){
    console.log(x*x);
}(9));         // argument diya ishlie 81 output aaya nhi to jo default value hai jese 4 to uska output aata 16 


