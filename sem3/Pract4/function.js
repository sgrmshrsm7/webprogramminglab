function ValidateEmail(uname, eid)
{
        var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
        if(uname.value.length > 6 && eid.value.match(mailformat))
        {
                alert("Form submission successful!");
                document.newletterform.username.focus();
                return true;
        }
        else
        {
                alert("Invalid username or mail address!");
                document.newletterform.username.focus();
                return false;
        }
}
