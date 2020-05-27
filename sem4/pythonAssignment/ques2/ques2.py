#!/usr/bin/env python3

fileText = open('class_scores.txt', 'r')
newfile = open("scores2.txt", "w")

for line in fileText:
        words = line.split(' ')
        words[1] = str(int(words[1]) + 5)
        newfile.write(words[0] + ' ' + words[1] + '\n')

fileText.close()
newfile.close()