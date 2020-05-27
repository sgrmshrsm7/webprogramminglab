#!/usr/bin/env python3

import re

regex = re.compile(r'^(Alice|Bob|Carol)[ ](eats|pets|throws)[ ](apples|cats|baseballs)[.]$', re.I)

str = input('Enter string to match : ')

if re.search(regex, str) is not None:
        print('Matched!')
else:
        print('Not matched!')