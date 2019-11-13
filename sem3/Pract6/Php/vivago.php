<html>
<head>
        <link rel="stylesheet" href="../Style/style.css">
        <link rel="stylesheet" href="../Style/hotel.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="icon" type="image/png" href="../Images/Vivago.png">
        <title>Select Hotel</title>
</head>
<body>
        <header class="notfull">
                <div class="head-flex">
                        <a href="../index.html" class="sitetitle">
                                Vivago
                        </a>
                </div>
        </header>

        <?php
        $k=$_POST['city'];
        ?>

        <h1 class="bumpertitle"><span>Showing Results for hotels in <?php echo $k ?></span></h1>

        <form method="post" action="../payment.html">
                <table>
                        <tr>
                                <th>Select</th>
                                <th>Hotel</td>
                                <th>Contact</td>
                                <th>Stars</td>
                                <th>Cost Per Night</td>
                                <th>Address</td>
                        </tr>
                        <?php
                        include('conn.php');
                        $sql="select * from selection where city='$k'";
                        $query=mysqli_query($conn,$sql);
                        while($res=mysqli_fetch_array($query)){
                        ?>
                        <tr>
                                <td class="selecthotels">
                                        <label class="container">
                                                <input type="radio" name="price" value="<?php $res['Costpernight']; ?>" required>
                                                <span class="checkmark"></span>
                                        </label>
                                </td>
                                <td> <?php echo $res['Hotel']; ?> </td>
                                <td> <?php echo $res['Contact']; ?> </td>
                                <td> <?php echo $res['Stars']; ?> </td>
                                <td> <?php echo $res['Costpernight']; ?> </td>
                                <td> <?php echo $res['Address']; ?> </td>
                        <?php }?>
                        </tr>
                </table>
                <div class="search-container" action="cal.php" method="post">
                        <div class="search-bar" style="justify-content: center;">
                                <div>
                                        <label for="">No. of days : </label>
                                        <input type="number" min="1" max="30" name="days" value="1" required>
                                </div>
                        </div>
                </div>
                <input type="submit" value="Confirm Hotel" class="confirmhotel">
        </form>

        <footer>
                <div class="followtray">
                        <a href="https://twitter.com/sgrmshrsm7" class="fa fa-twitter"></a>
                        <a href="https://github.com/sgrmshrsm7" class="fa fa-github"></a>
                        <a href="https://instagram.com/sgrmshrsm7" class="fa fa-instagram"></a>
                        <a href="https://facebook.com/sgrmshrsm7" class="fa fa-facebook"></a>
                </div>
                <div class="copyrights">
                        &copy; 2019 <b>|</b> Developed by <a href="https://sgrmshrsm7.github.io">@sgrmshrsm7</a>
                </div>
        </footer>
</body>
</html>
