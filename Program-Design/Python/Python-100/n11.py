string=input().split(",")
sub_string_left=[]
sub_string_right=[]
sub_string_left.append(string[0])
for i in range(1,len(string)):
    sub_string_right.append(string[i])
flag = True 
while flag:
    flag=False
    tar =""
    for i in range(len(sub_string_left)):  
        for j in range(len(sub_string_right)):
            if sub_string_right[j] <= sub_string_left[i]:
                tar =sub_string_right[0]
                flag=True
    if flag:
        sub_string_left.append(tar)
        sub_string_right.remove(tar)
        print(sub_string_left)
        print(sub_string_right)
        
print(len(sub_string_left))
    