n=int(input())
summ=0
for i in range(1,n+1):
    summ = summ + i/((2*i-1)*(2*i))
    print(summ)
print(summ)
