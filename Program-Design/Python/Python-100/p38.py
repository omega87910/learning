n = int(input())
summ=0
for i in range(1,n+1):
    if n % i == 0:
        summ+=1
        print(i)
if summ == 2 :
    print("Yes")
elif summ >2 :
    print("No")
else:
    print("No")
