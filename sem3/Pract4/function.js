function ValidateData(fname, uname, passwd, cpwd, eid, mnum)
{
        if (confirm("Are you sure you want to continue?"))
        {
                let flag1 = 0, flag2 = 0;
                for(i = 0; i < eid.value.length; i++)
                {
                        if(eid.value[i]=='@')
                                flag1 = 1;
                        if(eid.value[i]=='.')
                                flag2 = 1;
                }
                if(fname.value.length < 1)
                {
                        alert("First Name can't be null!");
                        return false;
                }

                else if(flag1*flag2 == 0)
                {
                        alert("Invalid email id!");
                        return false;
                }

                else if(isNaN(mnum.value))
                {
                        alert("Invalid Mobile Number!");
                        return false;
                }

                else if(uname.value.length < 6)
                {
                        alert("Username can't be smaller than 6!");
                        return false;
                }

                else if(passwd.value.length < 6)
                {
                        alert("Password Length can't be smaller than 6!");
                        return false;
                }

                else if(cpwd.value != passwd.value)
                {
                        alert("Both Passwords doesn't match!");
                        return false;
                }

                else
                {
                        alert("Congrats, Form submitted successfully!");
                        return true     ;
                }
        }
}
