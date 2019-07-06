n = int(input())
nums=[]
nums_sum=[]
for i in range(n):
    nums.append(int(input()))
    a = nums[i]
    summ=0
    while a > 0:
        summ=summ+a%10
        a=int(a/10)
    nums_sum.append(summ)
for i in range(n):
    for j in range(n):
        if nums_sum[i]<nums_sum[j] and i!=j:
            k=nums_sum[i]
            nums_sum[i]=nums_sum[j]
            nums_sum[j]=k
            k=nums[i]
            nums[i]=nums[j]
            nums[j]=k
        if nums_sum[i]==nums_sum[j] and i!=j:
            if nums[i] < nums[j]:
                k=nums_sum[i]
                nums_sum[i]=nums_sum[j]
                nums_sum[j]=k
                k=nums[i]
                nums[i]=nums[j]
                nums[j]=k
print(nums)