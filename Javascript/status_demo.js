const button = document.getElementById("update-status-btn");
const statusMessage = document.getElementById("status-msg");

button.addEventListener("click", () => {
  statusMessage.textContent = "Your upload has completed successfully.";
});