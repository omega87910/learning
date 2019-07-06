n = int(input())
for i in range(0,n+1):
    for k in range(i+1,n+1):
        print(" ",end="")
    for j in range(n-i+1,n+i):
        print("*",end="")
    print()