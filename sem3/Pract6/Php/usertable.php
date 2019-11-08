<?php
$servername = "localhost";
$username = "root";
$password = "";
$db = "iwp_proj";
$conn = new mysqli($servername, $username, $password,$db);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$sql = "CREATE TABLE details (
FirstName VARCHAR(50) NOT NULL,
LastName VARCHAR(50) NOT NULL,
Email VARCHAR(50) NOT NULL,
Contact BIGINT(10) UNSIGNED,
Password VARCHAR(20) NOT NULL,
PRIMARY KEY (Email)
)";

if ($conn->query($sql) === TRUE) {
    echo "Table student created successfully";
} else {
    echo "Error creating table: " . $conn->error;
}
?>
