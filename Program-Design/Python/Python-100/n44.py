n=int(input())
for i in range(2,n+1):
    times=0
    for j in range(1,i+1):
        if i%j==0:
            times+=1
    if times==2:
        print(i)
