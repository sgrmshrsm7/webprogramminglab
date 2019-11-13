function checkname()
{
        if(document.form1.cardname.value=="")
        {
                document.getElementById("qwerty1").innerHTML="<h5>Name of credit-card holder cannot be empty!!</h5>";
                return false;
        }
        if(document.form1.cardname.value.length>50)
        {
                document.getElementById("qwerty1").innerHTML="<h5>Name of credit-card holder cannot be more than 50 characters!!</h5>";
                document.getElementById("cname").value="";
                document.getElementById("cname").focus();
                return false;
        }
        var k=document.form1.cardname;
        var cardn=/^[A-Za-z ]+$/;
        if(k.value.match(cardn))
        {
                document.getElementById("qwerty1").innerHTML="";
                return true;
        }
        else
        {
                document.getElementById("qwerty1").innerHTML="<h5>Name of the card-holder should contain alphabets and spaces only(if any)!</h5>";
                document.getElementById("cname").value="";
                document.getElementById("cname").focus();
                return false;
        }
}

function cardnumber(inputtxt)
{
        if(document.form1.cardnum.value=="")
        {
                document.getElementById("qwerty").innerHTML="<h5>credit-card number cannot be empty!!</h5>";
                return false;
        }
        var mcardno = /^(?:5[1-5][0-9]{14})$/;
        var vcardno = /^4[0-9]{15}$/;
        var aecardno = /^3[4-7][0-9]{13}$/;
        if(inputtxt.value.match(mcardno))
        {
                document.getElementById("qwerty").innerHTML="";
                return true;
        }
        else if(inputtxt.value.match(vcardno))
        {
                document.getElementById("qwerty").innerHTML="";
                return true;
        }
        else if(inputtxt.value.match(aecardno))
        {
                document.getElementById("qwerty").innerHTML="";
                return true;
        }
        else
        {
                document.getElementById("qwerty").innerHTML= "<h4>Please Enter a valid credit-card number!</h4>";
                document.getElementById("ccnum").value="";
                document.getElementById("ccnum").focus();
                return false;
        }
}

function cvvcheck()
{
        if(document.form1.cv.value=="")
        {
                document.getElementById("demo").innerHTML="<h5>CVV of credit-card cannot be empty!!</h5>";
                return false;
        }
        var n=document.form1.cv.value;
        n.toString();
        if((n.length)!=3||(isNaN(n)==true))
        {
                document.getElementById("demo").innerHTML ="<h5>please Enter a valid CVV.CVV is 3-digit number provided on the backside of credit card</h5>";
                document.getElementById("cv").value="";
                document.getElementById("cv").focus();
        }
        else
        {
                document.getElementById("demo").innerHTML="";
        }
}

function finalcheck()
{
        if(document.form1.cardname.value=="")
        {
                document.getElementById("qwerty1").innerHTML="<h5>Name of credit-card holder cannot be empty!!</h5>";
                return false;
        }
        else if(document.form1.cardnum.value=="")
        {
                document.getElementById("qwerty").innerHTML="<h5>credit-card number cannot be empty!!</h5>";
                return false;
        }

        else if(document.form1.cv.value=="")
        {
                document.getElementById("demo").innerHTML="<h5>CVV of credit-card cannot be empty!!</h5>";
                return false;
        }
        else
        {
                alert("Payment Processed Successfully");
                window.location="congrats.html";
                return true;
        }
}
