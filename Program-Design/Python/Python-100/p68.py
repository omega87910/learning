n = bin(int(input()))
nn=int(n[2:])
summ=0
while nn>0:
    summ=summ+nn%10
    nn=int(nn/10)
print(summ)