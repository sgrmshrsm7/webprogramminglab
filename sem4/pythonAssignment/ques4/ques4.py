#!/usr/bin/env python3

fileText = open('grades.txt', 'r')

for line in fileText:
        words = line.split(' ')
        count = 0
        if int(words[1]) >= 40:
                count += 1
        if int(words[2]) >= 40:
                count += 1
        if int(words[3]) >= 40:
                count += 1
        print(words[0] + ' passed in ' + str(count) + ' subjects')

fileText.close()