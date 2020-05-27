#!/usr/bin/env python3

fileText = open('namelist.txt', 'r')

initials = input("Enter initials : ")

if (len(initials) == 2) + (len(initials) == 3):
        for line in fileText:
                words = line.split()
                if len(initials) == 2:
                        if (words[0][0] == initials[0]) * (words[len(words) - 1][0] == initials[1]):
                                print(line)
                elif len(words) == 3:
                        if (words[0][0] == initials[0]) * (words[1][0] == initials[1]) * (words[2][0] == initials[2]):
                                print(line)

fileText.close()