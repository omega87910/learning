a=[int(input()),int(input()),int(input()),int(input()),int(input())]
sum=0
for i in range(0,5):
    sum=sum+a[i]
print(sum/5)
sum=0
for i in range(0,5):
    if a[i]<60:
        sum+=1
print(sum)
sum=a[0]
for i in range(1,5):
    if a[i]>sum:
        sum=a[i]
print(sum)
sum=a[0]
for i in range(1,5):
    if a[i]<sum:
        sum=a[i]
print(sum)
