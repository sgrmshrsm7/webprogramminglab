#!/usr/bin/env python3

str1 = input('Enter string 1 : ')
str2 = input('Enter string 2 : ')
str = ''
if len(str1) == len(str2):
        for i in range(len(str1)):
                str += str1[i] + str2[i]
        print(str)
else:
        print('String lengths do not match!!!')