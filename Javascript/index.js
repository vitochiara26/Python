const btn = document.querySelector("button");
btn.addEventListener("click", () => alert("You clicked on the alert button"));

document.addEventListener("DOMContentLoaded", () => {
  const btn = document.querySelector(".start-btn");
  btn.addEventListener("click", () => {
    const paraEl = document.createElement("p");
    const bodyEl = document.querySelector("body");

    bodyEl.appendChild(paraEl);
    paraEl.textContent = "The game has started!!!";
  });
});