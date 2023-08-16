document.getElementById("newUser").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent default form submission

    // Collect form data
    var formData = new FormData(event.target);

    // Create and send HTTP request
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "your-java-endpoint-url", true);
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    xhr.send(formData);
});
