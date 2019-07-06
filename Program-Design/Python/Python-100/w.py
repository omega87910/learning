n=int(input())
a = n-2
for i in range(n):
    for j in range(4*n-3):
        if j == i or j+i == 2*n-2 or j-i ==2*n-2 or i+j ==3*n+n-4:
            print("*",end="")
        else:
            print(" ",end="")
    print()