let mouse_over = document.querySelector(".mouseOver_");

document.body.addEventListener("mouseover", () => {
    mouse_over.style.color = "red"
    document.body.style.backgroundColor = "grey"
});