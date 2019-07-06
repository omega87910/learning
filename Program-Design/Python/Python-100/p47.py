n=[]
for i in range(5):
    n.append(int(input()))

print(sum(n)/len(n))
loss = 0
for i in n:
    if i <60:
        loss+=1
print(loss)
print(max(n))
print(min(n))
