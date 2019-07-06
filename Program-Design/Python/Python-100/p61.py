f =[]
g =[]
n=int(input())
for i in range(n):
    f.append(int(input()))
n=int(input())
for i in range(n):
    g.append(int(input()))
summ=0
for i in range(len(g)):
    for j in range(len(f)):
        if g[i]==f[j]:
            summ+=1
            del f[j]
            break
        print(f)
print(summ)
        