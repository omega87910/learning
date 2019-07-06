n = int(input())
num=0
for i in range(1,n+1):
    for j in range(1,n+1):
        if i%j == 0:
            num+=1
    if num == 2 :
        print(str(i))
    num=0
            