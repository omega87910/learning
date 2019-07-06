n=int(input())
sum=1
for i in range(0,n+1):
        print(i+sum,end="\t")
        if i+sum>n:
            break;
        sum+=i
print()
for i in range(1,n+2):
    for j in range(1,i+1):
        print(i,end="\t")
