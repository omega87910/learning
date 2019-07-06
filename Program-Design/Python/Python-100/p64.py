n = int(input())
summ=0
normal = []
for i in range(n):
    normal.append([])
    for j in range(n):
        normal[i].append(0)
for i in range(1,n+1):
    for j in range(1,n+1):
        if i>=2 and i%2==0:
            summ+=1
            normal[i-1][n-j]=summ
        else:
            summ+=1
            normal[i-1][j-1]=summ
for i in range(n):
    for j in range(n):
        print(normal[i][j],end="\t")
    print()
print()
for i in range(n):
    for j in range(n):
        print(normal[j][i],end="\t")
    print()

