let input = document.querySelector("#container");
let log = document.querySelector("#display");


document.addEventListener("keydown", function(e){
    log.style.color = "red"
    log.innerText = e.key + " keydown";
});


document.addEventListener("keyup", function(e){
    log.style.color = "blue"
    log.innerText = e.key + " keyup";
});
