def square(arr):
    for i in range(len(arr)):
        print(str(pow(arr[i],2))+"\t",end="")
arr=[]
for i in range(4):
    arr.append(int(input()))
square(arr)