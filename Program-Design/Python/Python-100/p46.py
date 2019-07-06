import random as rd
rd.seed(input())
answer = str(rd.randint(1000,9999))
summ=0
inp = input()
for i in range(0,len(answer)):
    if inp[i] == answer[i]:
        summ+=1
print(summ)