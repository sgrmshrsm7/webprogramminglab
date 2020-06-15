<%String uname=(String)session.getAttribute("username"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
            if(session.getAttribute("username")==null)
            {
                response.sendRedirect("index.jsp");
            }
        
  %>
<html>
    <script type="text/javascript">
    var x = window.matchMedia("(max-width: 767.98px)");
    function changeactive(event) {
        console.log(event);
        var current = document.getElementsByClassName("active");
        if (current.length > 0) {
          current[0].className = current[0].className.replace(" active", "");
        }
        event.target.className += " active";
    }
      function openchat() {
        if(x.matches){
          document.getElementsByClassName('contacts-panel')[0].style.display = "none";
          document.getElementsByClassName('chat-panel')[0].style.display = "flex";
          document.getElementById('back-arrow').style.display = "inline-block";
          document.getElementById('burg').style.display = "inline-block";
        }
      }
      window.addEventListener("resize", () =>{
        if(window.innerWidth > 765){
          if(document.getElementsByClassName('contacts-panel')[0].style.display === "none")
            {document.getElementsByClassName('contacts-panel')[0].style.display = "flex";}
            if(document.getElementsByClassName('chat-panel')[0].style.display === "none")
              {document.getElementsByClassName('chat-panel')[0].style.display = "flex";}
          document.getElementById('back-arrow').style.display = "none";
          document.getElementById('burg').style.display = "none";
        }
      });
      function opencontacts(){
        if(x.matches){
          document.getElementsByClassName('contacts-panel')[0].style.display = "flex";
          document.getElementsByClassName('chat-panel')[0].style.display = "none";
        }
      }
      function openmembers(){
          if(x.matches){
            document.getElementsByClassName('members-panel')[0].style.display = "flex";
            document.getElementsByClassName('chat-panel')[0].style.display = "none";
          }
      }
      
      
  </script>
    <head>
        <meta charset="utf-8">
        <title>Welcome Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
          rel="stylesheet">
        <script type="text/javascript" src="check.js"></script>
        <link rel="stylesheet" href="Style/main.css">
        <script>
            setInterval(reloaddata,1000);
        </script>
    </head>
    <body onload="reloaddata();showFollowingGroups();">
      
      <div class="cont">
      <div class="row no-gutters">
        <div class="col-md-12 col-lg-1">
          <div class="personal-panel">
              <img src="Style/Tom.jpg" alt="" class="profile-image">
              <h6 class="profile-name"><%=uname%></h6>
              <ul class="list-unstyled" style="margin:20px auto;">
                <li class="link active" onclick="changeactive(event);showFollowingGroups();"><i class="material-icons" style="font-size: 20px;margin:15px;pointer-events: none;">chat</i></li>
                <li class="link" onclick="showGroups();changeactive(event);"><i class="material-icons" style="font-size: 24px;margin:13px;pointer-events: none;">group_add</i></li>
                <li class="link" onclick="changeactive(event);"><i class="material-icons" style="font-size: 20px;margin:15px;pointer-events: none;">settings</i></li>
                <li class="link"><i class="material-icons" style="font-size: 20px;margin:15px;"><a href="logout.jsp">logouts</a></i></li>
              </ul>
          </div>
        </div>
        <div class="col-md-6 col-lg-4">
          <div class="contacts-panel">
            <div class="panel-detail">
              <h4 id="title" class="m-0 font-weight-bold">Following</h4>
            </div>
<!--            <div class="search-box">
              <input type="text" name="contacts" value="" placeholder="Search">
              <i class="material-icons" style="color: gray;vertical-align: middle;">search</i>
            </div>-->
            <div id="groups" class="friend-box">

            </div>
          </div>
        </div>
        <div class="col-md-6 col-lg-7 col-xl-5">
          <div class="chat-panel">
              <div id="group-info" class="panel-detail">
                <i id="back-arrow" class="material-icons nevigation" onclick="opencontacts()">arrow_back</i>
                <div class="profile-image"></div>
                <div class="info" style="text-align:left;">
                  <h5 class="m-0"></h5>
                  <p style="white-space: nowrap;overflow: hidden;text-overflow: ellipsis;"></p>
                </div>
                <i id="burg" class="material-icons nevigation" onclick="openmembers()">short_text</i>
              </div>
              <div style="flex-grow: 1;overflow-y: scroll;" id="list">
                <p id="result"></p>
                <div class="chat-box" id="content">
                </div>
              </div>
              <div class="message-box">
                <input style="display: none" type="text" id="u" value="<%=uname%>">
                <input type="text" name="message" value="" placeholder="Type message" id="h">
                <i class="material-icons" style="">sentiment_satisfied_alt</i>
                <i class="material-icons" style="">attach_file</i>
                <i class="material-icons" style="" onclick="addText()">send</i>
              </div>
          </div>
        </div>
        <div class="col-lg-0 col-xl-2 members-panel">
            <div class="panel-detail">
                <i id="back-arrow-chat" class="material-icons nevigation" onclick="openchat()">arrow_back</i>
                <h4 class="m-0 font-weight-bold">Active Members</h4>
            </div>
            <div id="members" class="members-box pt-2">

            </div>
        </div>
        </div>
        </div>
      </div>
    </div>

    </body>
</html>
