#!/usr/bin/env python3

word = input('Enter a word : ')
c = input('Enter a character : ')
parts = word.split(c)
if len(parts) == 1:
        print('No such character present in the given string')
else:
        for i in parts:
                print(i, end = '')
                if i != parts[len(parts) - 1]:
                        print(c)
                else:
                        print('')