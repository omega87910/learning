a = input()
b = input()
a_array=[]
b_array=[]
for i in range(len(a)):
    a_array.append(a[i])
for i in range(len(b)):
    b_array.append(b[i])
flag = "False"
for i in range(len(b_array)):
    for j in range(len(b_array)):
        if i!=j:
            tar = b_array[j]
            b_array[j] = b_array[i]
            b_array[i] = tar
            if b_array == a_array:
                flag = "True"
                break
            else:
                tar = b_array[j]
                b_array[j] = b_array[i]
                b_array[i] = tar
print(flag)