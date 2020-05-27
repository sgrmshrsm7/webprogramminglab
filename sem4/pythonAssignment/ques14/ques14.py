#!/usr/bin/env python3

import pymysql

# Open database connection
db = pymysql.connect('localhost', 'sgr', 'Pass@123', 'mydb')
cur = db.cursor()

# Create
def mycreate():
        try:
                cur.execute('DROP TABLE IF EXISTS mytable')
                cur.execute('CREATE TABLE mytable(Id INT PRIMARY KEY AUTO_INCREMENT, Name VARCHAR(25))')
                cur.execute('INSERT INTO mytable(Name) VALUES(\'Ghanshyam\')')
                cur.execute('INSERT INTO mytable(Name) VALUES(\'Champak\')')
                cur.execute('INSERT INTO mytable(Name) VALUES(\'Chintu\')')
                cur.execute('INSERT INTO mytable(Name) VALUES(\'Suraj\')')
                cur.execute('INSERT INTO mytable(Name) VALUES(\'Ganesh\')')
                db.commit()
                print('Table created successfully!!!')
        except:
                db.rollback()
                print('Failed to create table!!!')

# Read
def myread():
        print('--------------------------------')
        try:
                cur.execute('SELECT * FROM mytable')
                results = cur.fetchall()
                print('Table fetched successfully : ')
                for row in results:
                        print(str(row[0]) + ' ' + row[1])
        except:
                print ("Unable to fetch data!!!")
        print('--------------------------------')

# Update
def myupdate():
        try:
                n = input('Enter Id of person whose name to be edited : ')
                name = input('Enter new name : ')
                cur.execute('UPDATE mytable SET Name = \'' + name + '\' WHERE Id = \'' + n + '\'')
                db.commit()
                print('Record updated successfully!')
        except:
                print('Unable to update!!!')

# Delete
def mydelete():
        try:
                name = input('Enter name of person to delete from table : ')
                cur.execute('DELETE from mytable WHERE Name = \'' + name + '\'')
                db.commit()
                print('Deleted successfully!!!')
        except:
                print('Unable to delete!')

mycreate()
myread()
myupdate()
myread()
mydelete()
myread()

# Disconnect from server
db.close()