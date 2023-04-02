let decrement_btn = document.querySelector("#decrement");
let Increment_btn = document.querySelector("#Increment");
let value_update = document.querySelector("#value");
let reset_btn = document.querySelector("#reset");

// Decrement btn
decrement_btn.addEventListener("click", () => {
  const dec_valuee = Number(value_update.innerText);
  if (dec_valuee > 0) {
    value_update.innerText = dec_valuee - 1;
  } else {
    alert("nagative value is not allow ");
  }
});

// Increment btn
Increment_btn.addEventListener("click", () => {
  const Inc_valuee = Number(value_update.innerText);
  if (Inc_valuee < 10) {
    value_update.innerText = Inc_valuee + 1;
  } else {
    alert("10+ value not allow");
  }
});

// reset btn
reset_btn.addEventListener("click", () => {
  value_update.innerText = 0;
});
