x=0
y=0
z=0
for i in range(0,6):
    a =int(input())
    if a==0:
        z+=1
    elif a>0:
        x+=1
    else:
        y+=1
print(x)
print(z)
print(y)

