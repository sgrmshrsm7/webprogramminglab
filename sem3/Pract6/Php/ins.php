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
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Nagpur','Raddison Blu',746214932,5,13450,'Airport,Nagpur');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Nagpur','Le Meridian Nagpur',864973256,5,8000,'Bajaj Nagar,Nagpur');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Nagpur','The Pride Hotel',856462447,4,6000,'Wardha Road,Nagpur');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Nagpur','The Grand Bhagawathi',699335821,4,5500,'Kampte Road');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Nagpur','The Travotel Suits',878564321,4,4800,'Police station,Nagpur');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}

$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Mumbai','Taj Lands End',782369421,5,27500,'Bandra West,Mumbai');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Mumbai','ITC Martha',958974613,5,26400,'Andheri East,Mumbai');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Mumbai','JW Marriot',833114759,5,20500,'Juhu,Mumbai');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Mumbai','The Oberoi',897645231,4,18600,'Nariman Point,Mumbai');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Mumbai','Four Seasons',852243619,4,17560,'Worli,Mumbai');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}

$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Hyderabad','Taj Krishna',744321987,5,15700,'Banjara Hills,Hyderabad');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Hyderabad','The Novotel',764798321,5,14000,'Airport Road,Hyderabad');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Hyderabad','ITC Kakatiya',848965042,5,14000,'High-Tech city,Hyderabad');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Hyderabad','Falaknuma Palace',640884355,4,20000,'Falakmuna,Hyderabad');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Hyderabad','Sheraton',928461395,4,16000,'Gachibowli,Hyderabad');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}

$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Chennai','Park Hyatt',76543218,5,26000,'Airport Road,Chennai');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Chennai','The Raintree',865498721,5,22000,'Anna Salai,Chennai');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Chennai','ITC Grandchola',952443187,5,20000,'Beachroad,Chennai');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Chennai','Novotel',82222222,4,18700,'Near Govt building,Chennai');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Chennai','Vivanta Chennai',69873210,4,16000,'IIt road,Chennai');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}

$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Delhi','The Leela',68743558,5,28000,'Chowk Nagar,Delhi');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Delhi','The Westin Guargon',96465410,4,160000,'Red fort Road,Delhi');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Delhi','ITC Maurya',56429931,5,22000,'Near IIT delhi,Delhi');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Delhi','Fraser Sites',86492413,4,18000,'Rastrapathi Bhavan Area,Delhi');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}
$sql = "INSERT INTO selection (City, Hotel, Contact, Stars, Costpernight, Address) 
VALUES ('Delhi','The Imperial',96874352,4,15600,'X road center,Delhi');";
if ($conn->query($sql) === TRUE) {
echo "";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}


$conn->close();
?>

