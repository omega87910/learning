n = int(input())
nums=[]
box=0
for i in range(n):
    nums.append(int(input()))
for i in range(len(nums)):
    for j in range(len(nums)):
        if nums[i]<nums[j] and i!=j:
            box = nums[j]
            nums[j]=nums[i]
            nums[i]=box
for i in range(len(nums)):
        print(nums[i])