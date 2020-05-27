#!/usr/bin/env python3

import random
import smtplib

emailAddress = []
tasks = []
n = int(input('Enter number of person : '))
print('Enter email addresses : ')
for i in range(n):
        emailAddress.append(input())
print('Enter tasks : ')
for i in range(n):
        tasks.append(input())
s = smtplib.SMTP('smtp.gmail.com', 587)
s.starttls()
s.login('sgrmshrsm7@gmail.com', '********')

for i in range(n):
        randomTask = random.choice(tasks)
        tasks.remove(randomTask)
        s.sendmail('sgrmshrsm7@gmail.com', emailAddress[i], 'Hello ' + emailAddress[i] + ' you are assigned task : ' + randomTask)
        print(emailAddress[i] + ' is assigned task : ' + randomTask)

s.quit()