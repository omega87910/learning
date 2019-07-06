import random as rd
rd.seed(input())
a=rd.randint(1,100)
b=rd.randint(1,100)
c=rd.randint(1,100)
print("%d %d"%(max(a,b,c),min(a,b,c)))
