const dialog = document.getElementById("custom-dialog");
const openBtn = document.getElementById("open-dialog");
const closeBtn = document.getElementById("close-dialog");
const confirmBtn = document.getElementById("confirm-btn");

openBtn.addEventListener("click", () => {
  dialog.style.display = "flex";
});

closeBtn.addEventListener("click", () => {
  dialog.style.display = "none";
});

confirmBtn.addEventListener("click", () => {
  alert("File deleted.");
  dialog.style.display = "none";
});