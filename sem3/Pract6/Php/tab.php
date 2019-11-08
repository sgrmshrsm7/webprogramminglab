 <?php
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

// sql to create table
$sql = "CREATE TABLE selection (
City VARCHAR(30) NOT NULL,
Hotel VARCHAR(30) NOT NULL,
Contact INT(10) UNSIGNED,
Stars INT(5) UNSIGNED,
Costpernight INT(6) UNSIGNED,
Address VARCHAR(50)
)";

if ($conn->query($sql) === TRUE) {
    echo "Table student created successfully";
} else {
    echo "Error creating table: " . $conn->error;
}

$conn->close();
?> 
