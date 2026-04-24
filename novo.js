const container = document.querySelector(".container");

btn.addEventListener("mouseover", () => {
  const largura = container.clientWidth - btn.offsetWidth;
  const altura = container.clientHeight - btn.offsetHeight;

  btn.style.position = "absolute";
  btn.style.left = Math.random() * largura + "px";
  btn.style.top = Math.random() * altura + "px";
});