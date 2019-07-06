nums = []
for i in range(int(input())):
    nums.append(int(input()))
the_max = min(nums)
for i in range(len(nums)):
    summ=nums[i]
    for j in range(i+1,len(nums)):
        summ = summ * nums[j]
        if summ > the_max:
            the_max = summ
print(the_max)