<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "db_vnit";
$conn = new mysqli($servername, $username, $password, $dbname);
if ($conn->connect_error) {
die("Connection failed: " . $conn->connect_error);
}
$sql = "CREATE TABLE student (
roll_no INT(6) PRIMARY KEY,
name VARCHAR(30) NOT NULL,
gender VARCHAR(30) NOT NULL,
age INT(6) UNSIGNED,
branch VARCHAR(30) NOT NULL,
address VARCHAR(50)
)";
if ($conn->query($sql) === TRUE) {
echo "Table student created successfully";
} else {
echo "Error creating table: " . $conn->error;
}
$conn->close();
?>
