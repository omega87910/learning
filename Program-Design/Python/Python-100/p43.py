n = int(input())
num=1
a=1
print(num,end="\t")
while num < n :
    num=num+a
    a=a+1
    print(num,end="\t")
print()
for i in range(num+1):
    for j in range(i):
        print(i,end="\t")
print()