a=[]
while(True):
    c= int(input())
    if c==-9999:
        break
    a.append(c)
print(tuple(a))
print("Length: "+str(len(a)))
print("Max: " +str(max(a)))
print("Min: "+str(min(a)))
print("Sum: "+str(sum(a)))
