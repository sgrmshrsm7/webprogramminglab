#!/usr/bin/env python3

# importing smtp module
import smtplib

# creates SMTP session
s = smtplib.SMTP('smtp.gmail.com', 587)

# start TLS for security
s.starttls()

# sender's details
seid = 'sgrmshrsm7@gmail.com'
spass = '********'

# authentication
s.login(seid, spass)

# receiver's email id
reid = input('Enter receiver\'s email id : ')

# message to be sent
message = input('Enter message you want to send : ')

# sending the mail
s.sendmail(seid, reid, message)
print('Message sent successfully!')

# terminating the session
s.quit()