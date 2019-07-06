n = int(input())
for i in range(0,n):
    for k in range(i+1,n):
        print(" ",end="")
    for j in range(n-i,n+1):
        print("*",end="")
    print()
