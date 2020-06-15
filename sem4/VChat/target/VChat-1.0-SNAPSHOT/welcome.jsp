<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String uname=(String)session.getAttribute("username"); %>
<!DOCTYPE html>
 <% 
            if(session.getAttribute("username")==null)
            {
                response.sendRedirect("index.jsp");
            }
        
  %>
  
<html>
    <head>
            <title>Welcome Admin</title>
            <link rel="stylesheet" href="Style/style.css">
            <script type="text/javascript" src="check.js"></script>
            <script>
                setInterval(printtable,1000);
            </script>
    </head>
    <body>
            <div class="colorcontainer"></div>
                <div class="formcontainer adminform">
                        <div class="heading" align="center">VChat</div>
                        <div class="formheading">Welcome <%=uname%>!</div>
                        <p>Delete any member you want to delete.</p>
                        <form action="index.jsp">
                                <table id="tablerows">
                                        
                                </table>
                                <div class="buttoncontainer">
                                        <button type="submit" class="signinbutton" value="Logout">
                                                <div class="btntxt">Logout</div>
                                        </button>
                                </div>
                        </form>
                </div>
                <div class="foot">Welcome to the official VChat web-client.</div>
                
    </body>
</html>
