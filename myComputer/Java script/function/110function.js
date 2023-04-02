function display_message(value_) {
    console.log(value_);
}
display_message("I am very Happy");

// default value set krne ke lie 
function dis_message(value = "aashish") {
    console.log(value);
  }
  // if koi argument nhi diya to default value print hogi jo ki ish code me aashish hai 
  dis_message();
  
  // argument dene pr 
  dis_message("vivek");
  
  
  // double parameter dena ho to
  function two_value(x,y){
    let z = x+y;
    return z;
  }
  let adding = two_value(3,5);

  console.log(two_value(22,22));   //ese bhi print kra sakte hai 
  
  console.log(adding);  // or ese bhi       
  
 // double parameter dene pr but default value dene pr or defautl value hamesa right side se di jati hai 
//   kyuki argument left se chalu hota hai taki jab ham argument me ek hi value de to vah left se add hoti 
// hai or hamne right ki value to default set kr die hai 
  function two_value_(x=22,y=88){
    let z=x+y;
    return z;
  } 
  
  // ye 3rd variable bnane pr print ho rha hai  taki ish varible ka use krne or kahi pr bhi ishe print kra sakte hai 
  /* ishme argument nhi die kyu ki upar parameter me die hue hai  */
  let add = two_value_();
  console.log(add);

//   ek argument dene pr
let add3 = two_value_(2);
console.log(add3);

//   ishme do argument dene pr      ye sab kam without 3rd varible ke bhi bna sakte the 
let add2 = two_value_(22,44);
console.log(add2);
  
  // without 3rd variable
  console.log(two_value_(12,38));


//   array as a argument
function array([num1, num2]){
    let num3 = num1 + num2 ;
    return num3;
}

let array_output = array([2,9]);
console.log(array_output);

// new tarike se do value lene pr

function array1([num1, num2]){
    let num3 = num1 + num2 ;
    return num3;
}
// new one 
let array_output_= [22,88];
console.log(array1(array_output_));

