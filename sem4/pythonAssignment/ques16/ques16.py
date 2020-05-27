#!/usr/bin/env python3

import cgi

FORM = cgi.FieldStorage()
print("Content-Type: text/html\n")
try:
        username = FORM['username'].value
        password = FORM['pass'].value
        fileText = open('login.csv', 'r')
        for line in fileText:
                unamepass = line.split(',')
                found = 0
                for j in range(int(len(unamepass) / 2)):
                        if (username == unamepass[2 * j]) * (password == unamepass[2 * j + 1]):
                                found = 1
                                print('<h1>Welcome ' + unamepass[2 * j] + '!!!</h1>')
                                break
                if found == 0:
                        print('<h1>User not found!</h1>')
except:
        print("Error!")