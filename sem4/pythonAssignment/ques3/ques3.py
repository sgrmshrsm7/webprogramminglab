#!/usr/bin/env python3

fileText = open('students.txt', 'r')
newfile = open("students2.txt", "w")

for line in fileText:
        words = line.split('    ')
        name = words[0].split(' ')
        name[0] = name[0].capitalize()
        name[1] = name[1].capitalize()
        words[0] = name[0] + ' ' + name[1]
        words[2] = '301-' + words[2]
        newfile.write(words[0] + '    ' + words[1] + '    ' + words[2])

fileText.close()
newfile.close()