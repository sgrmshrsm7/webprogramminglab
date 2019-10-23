<?php
$conn=mysqli_connect("localhost", "root");
mysqli_select_db($conn, "db_vnit");
if($conn)
{
echo"connected";
}
else
{
echo"not connected";
}
?>
