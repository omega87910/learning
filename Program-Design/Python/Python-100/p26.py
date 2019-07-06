arr = []
for i in range(0,5):
    arr.append([])
    for j in range(0,7):
        arr[i].append(input())
    print(arr)
for i in range(0,7):
    for j in range(0,5):
        print(arr[j][i]+"\t",end="")
    print()
