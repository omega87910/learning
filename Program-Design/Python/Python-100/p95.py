n=int(input())
lists =[]
for i in range(n):
    lists.append(input())
for i in range(len(lists)):
    summ=0
    for j in range(len(lists[i])):
        summ=summ+ord(lists[i][j])
    print(summ)