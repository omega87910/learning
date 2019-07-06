content = input()
n=int(input())
for i in range(len(content)):
    if (ord(content[i])>=65 and ord(content[i])<=90) or (ord(content[i])>=97 and ord(content[i])<=122):
        print(chr(ord(content[i])+n),end="")
    else:
        print(content[i],end="")
print()