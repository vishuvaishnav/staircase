import re

#========================= Phone Number validator===============================

s = input("enter phone number")
pattern = re.compile(r'\d{3}-\d{3}-\d{4}$')
if pattern.match(s):
    print("TRUE")
else:
    print("FALSE")

#============================== Email validator ================================

s=input("enter email address")
pattern = re.compile(r'\w+@\w+\.\w+')

if pattern.match(s) :
    print("TRUE")
else:
    print("FALSE")
