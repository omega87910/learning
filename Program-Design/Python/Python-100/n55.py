numbers=int(input())
a=[]
for i in range(0,numbers):
    a.append(int(input()))
for i in range(0,numbers):
    for j in range(0,numbers):
        if a[j]>a[j+1]:
            box=a[j]
            a[j]=a[j+1]
            a[j+1]=box
        if j+2>=numbers:
            break
for i in range(0,numbers):
    print(a[i],end="\t")
print()
