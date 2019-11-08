function ValidateData(){
        var x=document.forms["signupform"]["firstname"].value;
        var y=document.forms["signupform"]["lastname"].value;
        var z=document.forms["signupform"]["email"].value;
        var a=document.forms["signupform"]["mobile"].value;
        var b=document.forms["signupform"]["password"].value;
        var c=document.forms["signupform"]["confirmpassword"].value;
        var n=1;
        if(x.length == 0){
                alert("First name can't be empty");
                n=0;
        }
        else if(y.length == 0){
                alert("Last name can't be empty");
                n=0;
        }
        else if(z.length == 0){
                alert("Email not entered");
                n=0;
        }
        else if(a.length !=10){
                alert("Mobile number not entered");
                n=0;
        }
        else if(c.length == 0){
                alert("Enter confirm password");
                n=0;
        }
        else if(b != c){
                alert("Confirm password doesn't match");
        }
        else{
                alert("Registered successfully");
        }
        if (n == 0) {
                return false;
        }
        else{
                return true;
        }
}
