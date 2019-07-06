n = int(input())
summ=0
string=""
flag=bool(0)
for i in range(1,n+1):
    for j in range(i,(n+1)):
        summ=summ+j
        string=string+str(j)+"+"
        if summ==n and j!=n:
            flag=bool(1)
            string=string[0:len(string)-1]
            print(string)
    summ=0
    string=""
if flag==bool(0):
    print("No")
