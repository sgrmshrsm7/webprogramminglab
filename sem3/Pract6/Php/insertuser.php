<?php
$a=$_POST['firstname'];
$b=$_POST['email'];
$c=$_POST['mobile'];
$f=$_POST['password'];
$e=$_POST['lastname'];
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "iwp_proj";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
$sql = "INSERT INTO details (FirstName,LastName,Email,Contact,Password) 
VALUES ('$a','$e','$b','$c','$f')";
if ($conn->query($sql) === TRUE) {
    echo "New records created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>
<?php header("Location:../login.html"); ?>
