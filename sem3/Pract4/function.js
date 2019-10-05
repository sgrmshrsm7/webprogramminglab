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
                
        }
}
