nums = [int(input()),int(input()),int(input()),int(input()),int(input()),int(input())]
a=0
b=0
c=0
for i in nums:
    if i >0:
       a+=1
    if i == 0 :
        b+=1
    if i <0:
        c+=1
print("+ = "+str(a))
print("0 = "+str(b))
print("- = "+str(c))
