#!/usr/bin/env python3

import glob, re

regex = 'python'
pattern = re.compile(r"%s"%regex)

for fileName in glob.glob('./*.txt'):
        fileText = open(fileName, 'r')
        for line in fileText:
                if re.search(pattern, line) is not None:
                        print('\nFile ' + fileName + ' contains python')
                        break
        fileText.close()