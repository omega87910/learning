n=int(input())
x=[]
for i in range(0,n):
    x.append(int(input()))
def square(x1):
    for i in range(0,len(x1)):
        x1[i]=pow(x1[i],2)
    return x1
square(x)
for i in range(0,len(x)):
    print(x[i],end="\t")
print()
