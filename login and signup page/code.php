<?php

                                               //SIGNUP

 if (isset($_POST["REQUEST_METHOD"] == "SignupBtn")){
$username = $_POST['Username'];
$email = $_POST['Email'];
$phone = $_POST['Password'];


$servername = "localhost";
$username = "your_name";
$password = "your_password";
$dbname = "yourdatabase_name";

$conn = new mysqli($localhost, $your_name,'', '');

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}


$stmt = $conn->prepare("INSERT INTO your_table_name (Username, Email,Password) VALUES (?, ?, ?, ?)");
$stmt->bind_param("ssss", $username, $email, $password);


if ($stmt->execute()) {
    echo "Message sent successfully!";
} else {
    echo "Error: " . $stmt->error;
}


$stmt->close();
$conn->close();
}
?>






<?php

                                                  //LOGIN

if (isset($_POST["REQUEST_METHOD"]) == "LoginBtn"){
$email = $_POST['Email'];
$phone = $_POST['Password'];



$servername = "localhost";
$username = "your_name";
$password = "your_password";
$dbname = "yourdatabase_name";


$conn = new mysqli($localhost, $your_name,'', '');


if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}


$stmt = $conn->prepare("INSERT INTO your_table_name (Email,Password) VALUES (?, ?, ?, ?)");
$stmt->bind_param("ssss",$email, $password);


if ($stmt->execute()) {
    echo "Message sent successfully!";
} else {
    echo "Error: " . $stmt->error;
}

$stmt->close();
$conn->close();
}
?>

