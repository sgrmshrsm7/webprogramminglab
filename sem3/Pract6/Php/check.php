<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "iwp_proj";
$e=$_POST['email'];
// Create connection
$conn = mysqli_connect($servername, $username, $password,$dbname);
// Check connection
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}

 
 $select="SELECT * FROM details WHERE Email='$e'";
$run=mysqli_query($conn,$select) ;
if($row=mysqli_fetch_array($run)){
$EMAIL=$row['email']; 
header("Location:../index.html");
}
else {header("Location:../signup.html");}
?>
