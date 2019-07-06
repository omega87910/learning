n=int(input())
times=0
for i in range(1,n+1):
    if n%i==0:
        times+=1
        print(i)
if times==2:
    print("Yes")
else:
    print("No")
