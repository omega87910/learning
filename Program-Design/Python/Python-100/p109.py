n = int(input())
for i in range(n):
    num = []
    num.append(int(input()))
    num.append(int(input()))
    num.append(int(input()))
    lessthan60 = 0
    the_max = max(num)
    for j in range(3):
        if num[j]<60:
            lessthan60+=1
    if num[0]>60 and num[1]>60 and num[2]>60:
        print("P")
    elif lessthan60==1 and sum(num)>=220:
        print("P")
    elif lessthan60==1 and sum(num)<220:
        print("M")
    elif lessthan60==2 and the_max>=80:
        print("M")
    else:
        print("F")
    
