#!/usr/bin/env python3

m = int(input('Enter number of rows : '))
n = int(input('Enter number of cols : '))

tableData = []
for i in range(m):
        r = []
        for j in range(n):
                r.append(input())
        tableData.append(r)
def printTable():
        print('----------------')
        for i in range(n):
                for j in range(m):
                        print(tableData[j][i], end = ' ')
                print('')
printTable()