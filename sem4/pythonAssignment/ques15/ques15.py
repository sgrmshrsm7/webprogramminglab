#!/usr/bin/env python3

import cgi

FORM = cgi.FieldStorage()
print("Content-Type: text/html\n")
try:
        TEXT = FORM['mytext'].value
        TEXT = TEXT[::-1]
        print('<h1>Reversed paragraph is :</h1>')
        print('<h3>' + TEXT + '</h3>')
except KeyError:
        print("Please enter something")