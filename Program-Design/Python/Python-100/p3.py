import random as rd
flag=bool(1)
rd.seed(input())
while(flag):
    flag=bool(0)
    list =[rd.randint(1,42),rd.randint(1,42),rd.randint(1,42),rd.randint(1,42),rd.randint(1,42),rd.randint(1,42)]
    for i in range(len(list)):
        for j in range(len(list)):
            if list[i]==list[j] and i!=j :
                flag=bool(1)
print(list)                
