<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "db_vnit";
$conn = new mysqli($servername, $username, $password, $dbname);
if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
}
$sql = "INSERT INTO student (roll_no, name, gender, age, branch, address)
VALUES ('1', 'Casillas', 'male', '38', 'CSE', 'Madrid Spain')";
if ($conn->query($sql) === TRUE) {
echo "New record created successfully";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}

$sql = "INSERT INTO student (roll_no, name, gender, age, branch, address)
VALUES ('2', 'Marcelo', 'male', '30', 'CSE', 'Brazil')";
if ($conn->query($sql) === TRUE) {
echo "New record created successfully";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}

$sql = "INSERT INTO student (roll_no, name, gender, age, branch, address)
VALUES ('3', 'Chiellini', 'male', '35', 'CSE', 'Italy')";
if ($conn->query($sql) === TRUE) {
echo "New record created successfully";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}

$sql = "INSERT INTO student (roll_no, name, gender, age, branch, address)
VALUES ('4', 'De Ligt', 'male', '20', 'CSE', 'Netherlands')";
if ($conn->query($sql) === TRUE) {
echo "New record created successfully";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}

$sql = "INSERT INTO student (roll_no, name, gender, age, branch, address)
VALUES ('5', 'Toni Kroos', 'male', '26', 'Metallurgy', 'Germany')";
if ($conn->query($sql) === TRUE) {
echo "New record created successfully";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}

$sql = "INSERT INTO student (roll_no, name, gender, age, branch, address)
VALUES ('6', 'Neymar', 'male', '27', 'Mining', 'Brazil')";
if ($conn->query($sql) === TRUE) {
echo "New record created successfully";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}

$sql = "INSERT INTO student (roll_no, name, gender, age, branch, address)
VALUES ('7', 'Cristiano Ronaldo', 'male', '34', 'CSE', 'Madira Portugal')";
if ($conn->query($sql) === TRUE) {
echo "New record created successfully";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}

$sql = "INSERT INTO student (roll_no, name, gender, age, branch, address)
VALUES ('8', 'Ronaldinho', 'male', '40', 'Mechanical', 'Brazil')";
if ($conn->query($sql) === TRUE) {
echo "New record created successfully";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}

$sql = "INSERT INTO student (roll_no, name, gender, age, branch, address)
VALUES ('9', 'Ibrahimovic', 'male', '36', 'CSE', 'Sweden')";
if ($conn->query($sql) === TRUE) {
echo "New record created successfully";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}

$sql = "INSERT INTO student (roll_no, name, gender, age, branch, address)
VALUES ('10', 'Leonel Messi', 'male', '32', 'Civil', 'Argentina')";
if ($conn->query($sql) === TRUE) {
echo "New record created successfully";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>
