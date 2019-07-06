import random as rd
rd.seed(input())
list=[]
for i in range(5):
    list.append([])
    for j in range(5):
        list[i].append(rd.randint(0,9))
for i in range(len(list)):
    for j in range(len(list)):
        print(str(list[i][j])+"\t",end="")
    print()
print()    
for i in range(len(list)):
    for j in range(len(list)):
        print(str(list[j][i])+"\t",end="")
    print()
    