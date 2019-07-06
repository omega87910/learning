limit = int(input())
a = int(input())
b = int (input())
a_list=[]
b_list=[]
times_a=1
times_b=1
a_list.append(a)
b_list.append(b)
while True:
    if a_list[times_a-1] < limit and a*times_a<limit:
        a_list.append(a*times_a)
    else:
        break
    times_a+=1
while True:
    if b_list[times_b-1] < limit and b*times_b<limit:
        b_list.append(b*times_b)
    else:
        break
    times_b+=1
a_list.pop(0)
b_list.pop(0)
summ=sum(a_list)+sum(b_list)
for i in a_list:
    for j in b_list:
        if i==j and i%a==0 and i%b==0:
            summ-=i
print(summ)
