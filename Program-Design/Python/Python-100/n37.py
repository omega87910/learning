n=int(input())
for i in range(0,n):
    for k in range(n,i+1,-1):
        print(" ",end="")
    for j in range(0,i+1):
        print("*",end="")
    for z in range(1,i+1):
        print("*",end="")
    print()
