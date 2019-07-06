num = [int(input()),int(input()),int(input()),int(input()),int(input()),int(input()),int(input()),int(input()),int(input()),int(input()),int(input()),int(input())]
summ=0
for i in range(len(num)):
    if i%2==0:
        summ=summ+num[i]
for i in range(len(num)):
    space=""
    for j in range(3-len(str(num[i]))):
        space = space +" "
    print(space+str(num[i]),end="")
    if i%3 == 2:
        print()
print(summ)
