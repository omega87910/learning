nums=[]
for i in range(int(input())):
    nums.append(int(input()))
string=""
for i in range(len(nums)):
    summ= nums[i]
    string= str(nums[i])
    for j in range(i+1,len(nums)):
        summ=summ+nums[j]
        string = string +" "+ str(nums[j])
        if summ == 0:
            print(string)
        