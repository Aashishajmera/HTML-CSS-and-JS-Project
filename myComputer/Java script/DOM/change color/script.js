// target krne pr
let btn = document.querySelector(".btnn");

// arrow function
const randomColor = () => {
  let hex_color_value = "0123456789ABCDEF";
  let compulsory = "#";
  for (let value = 0; value < 6; value++) {
    compulsory += hex_color_value[Math.floor(Math.random() * 16)];
  }
  return compulsory;
};

console.log(randomColor());

// change random color

function changeRandomColor() {
  document.body.style.backgroundColor = randomColor();
}

btn.addEventListener("click", changeRandomColor);
