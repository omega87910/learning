number=int(input())
n=[]
for i in range(0,number):
    n.append(input())
for i in range(0,len(n)):
    for j in range(0,len(n)):
        if n[j]>n[j+1]:
            box=n[j]
            n[j]=n[j+1]
            n[j+1]=box
        if j+2>=len(n):
            break
for i in range(0,len(n)):
    print(n[i])
