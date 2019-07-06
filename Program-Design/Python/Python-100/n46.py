import random as rd
rd.seed(input())
anwser=rd.randint(1000,9999)
print(anwser)
a=int(input())
times=0
for i in range(0,4):
    if a%10==anwser%10:
        times+=1
    a=int(a/10)
    anwser=int(anwser/10)
print(times)
