<html>
<body>
<table>
<tr>
<td>Roll Number</td>
<td>Name</td>
<td>Gender</td>
<td>Age</td>
<td>Branch</td>
<td>Address</td>
</tr>
<?php
include('conn.php');
$sql="select * from student";
$query=mysqli_query($conn,$sql);
while($res=mysqli_fetch_array($query)){
?>
<tr>
<td> <?php echo $res['roll_no']; ?> </td>
<td> <?php echo $res['name']; ?> </td>
<td> <?php echo $res['gender']; ?> </td>
<td> <?php echo $res['age']; ?> </td>
<td> <?php echo $res['branch']; ?> </td>
<td> <?php echo $res['address']; ?> </td>
<?php }?>
</tr>
</body>
</html> 
