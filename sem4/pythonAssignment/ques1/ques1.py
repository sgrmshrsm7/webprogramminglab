#!/usr/bin/env python3

import glob, re

regex = input('Enter your regular expression : ')

for fileName in glob.glob('./*.txt'):
	print('\n\nFor File ' + fileName + ':');
	fileText = open(fileName, 'r')
	pattern = re.compile(r"%s"%regex)
	for line in fileText:
		if re.search(pattern, line) is not None:
			print(line, end = '')
	fileText.close()