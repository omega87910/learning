lis ={}
string =input()
for i in string:
    if i != " ":
        if lis.get(i)==None:
            lis.__setitem__(i,1)
        elif lis.get(i)!=None:
            lis.__setitem__(i,lis.get(i)+1)
print(len(string.split(" ")))
c = []
for i in lis:
    c.append(i)
for i in range(len(c)):
    for j in range(len(c)):
        if ord(c[i].lower())<ord(c[j].lower()) and i!=j:
            k = c[i]
            c[i]=c[j]
            c[j]=k
for i in c:
    print(str(i)+"="+str(lis.get(i)))