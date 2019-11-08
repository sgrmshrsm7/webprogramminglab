<?php
$conn=mysqli_connect("localhost", "root");
mysqli_select_db($conn, "iwp_proj");
if($conn)
{
echo"";
}
else
{
echo"not connected";
}
?>
