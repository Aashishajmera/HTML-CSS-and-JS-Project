let span_tag = document.querySelector("span")

document.body.addEventListener("dblclick", dblclick_function);

function dblclick_function() {
    span_tag.style.backgroundColor = "blue";
}