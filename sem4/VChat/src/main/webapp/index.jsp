<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Style/style.css">
        <title>VChat</title>
        <script>
		function checkusername()
		{
			if(document.signupform.username.value.length < 6)
				document.getElementById("unerror").innerHTML = "Username must be atleast 6characters long";
		}
		function resetunerror()
		{
			document.getElementById("unerror").innerHTML = "";
		}
		function checkpassword()
		{
			if(/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/.test(document.signupform.password.value));
                        else
                                document.getElementById("passerror").innerHTML = "Invalid Password";
			
		}
		function resetpasserror()
		{
			document.getElementById("passerror").innerHTML = "";
		}
	</script>
</head>
<body>
        <div class="colorcontainer"></div>
        <div class="formcontainer">
                <div class="heading" align="center">VChat</div>
                <div class="formheading">Welcome!</div>
                <div id="loginerror" align="center">${error}</div>
                <p>Please enter username and password.</p>
                <form name="signupform" action="login" method="post">
                        <div class="tooltip">
                                <input type="text" id="username" name="username" required placeholder="Username" onblur="checkusername();" onclick="resetunerror();">
                                <span class="tooltiptext">Username must contain at least 6characters.</span>
                        </div>
                        <div id="unerror"></div>
                        <div class="tooltip">
                                <input type="password" id="password" name="password" required placeholder="Password" onblur="checkpassword();" onclick="resetpasserror();">
                                <span class="tooltiptext">At least 8characters, at least one upper and lower case alphabet, at least one number and at least one special character.</span>
                        </div>
                        <div id="passerror"></div>
                        <div class="buttoncontainer">
                                <button type="submit" class="signinbutton" value="signin">
                                        <div class="btntxt">Sign in</div>
                                </button>
                                <a href="signup.jsp" class="dummybutton">
                                        <div class="btntxt">Sign up</div>
				</a>
                        </div>
                </form>
        </div>
        <div class="foot">Welcome to the official VChat web-client.</div>
</body>
</html>
