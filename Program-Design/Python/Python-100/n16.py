str=input()
if ord(str)>=65 and ord(str)<=90:
    print("capital")
elif ord(str)>=97 and ord(str)<=122:
    print("lowercase")
else:
    print("special")
